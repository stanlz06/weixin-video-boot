package com.stanlz.controller;

import com.stanlz.entity.Users;
import com.stanlz.entity.vo.UsersVO;
import com.stanlz.service.UserService;
import com.stanlz.utils.JSONResult;
import com.stanlz.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description: 用户注册登录的controller
 */

@Api(tags= {"LoginAndRegistController"},description="用户注册登录的接口")
@RestController
public class LoginAndRegistController extends BasicController{
    @Autowired
    private UserService userService;

    @ApiOperation(value="用户注册")
    @PostMapping("/regist")
    public JSONResult regist(@RequestBody Users user) throws Exception{
        String username = user.getUsername();
        String password = user.getPassword();

        // 判断用户名和密码必须不为空
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            JSONResult.errorMsg("用户名和密码不能为空~！");
        }

        // 判断用户名是否存在
        boolean usernameIsExist = userService.queryUsernameIsExist(username);

        // 保存用户,注册信息
        if(!usernameIsExist){
            user.setNickname(username);
            user.setPassword(MD5Utils.getMD5Str(password));// md5加密
            user.setFansCounts(0);
            user.setReceiveLikeCounts(0);
            user.setFollowCounts(0);
            userService.saveUser(user);
        }else {
            return JSONResult.errorMsg("用户名已经存在，请换一个再试~!");
        }

        // 把用户密码保存到数据库,不返回到前端
        user.setPassword("");

        // 保存到redis并封装到VO
        UsersVO userVO = setUserRedisSessionToken(user);
        return JSONResult.ok(userVO);
    }

    @ApiOperation(value="用户登录")
    @PostMapping("/login")
    public JSONResult login(@RequestBody Users user) throws Exception {
        String username = user.getUsername();
        String password = user.getPassword();

        // 判断用户名和密码必须不为空
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return JSONResult.errorMsg("用户名或密码不能为空...");
        }

        // 判断用户是否存在
        Users userResult = userService.queryUserForLogin(username,
                MD5Utils.getMD5Str(password));

        if (userResult != null) {
            //只保存到数据库，不返回到前端
            userResult.setPassword("");

            // 保存到redis并封装到VO
            UsersVO userVO = setUserRedisSessionToken(userResult);
            return JSONResult.ok(userVO);
        } else {
            return JSONResult.errorMsg("用户名或密码不正确, 请重试...");
        }
    }

    @ApiOperation(value="用户注销")
    @ApiImplicitParam(name="userId", value="用户id", required=true,
            dataType="String", paramType="query")
    @PostMapping("/logout")
    public JSONResult logout(String userId) {
        // 清除redis对应的数据
        redis.del(USER_REDIS_SESSION + ":" + userId);
        return JSONResult.ok();
    }

    // 公共方法，保存到redis并封装成vo返回
    public UsersVO setUserRedisSessionToken(Users userModel) {
        // UUID生成随机数据作为value
        String uniqueToken = UUID.randomUUID().toString();

        // 半小时失效
        redis.set(USER_REDIS_SESSION + ":" + userModel.getId(), uniqueToken, 1000 * 60 * 30);

        UsersVO userVO = new UsersVO();

        // 利用BeanUtils吧user对象复制到VO里面
        BeanUtils.copyProperties(userModel, userVO);
        userVO.setUserToken(uniqueToken);
        return userVO;
    }
}
