package com.stanlz.service;

import com.stanlz.entity.Users;

public interface UserService {
    // 判断用户名是否存在
    boolean queryUsernameIsExist(String username);

    // 保存用户
    void saveUser(Users user);

    // 判断用户是否存在
    Users queryUserForLogin(String username,String password);

    // 修改用户信息
    void updateUserInfo(Users user);

    // 查询用户信息
    Users queryUserInfo(String userId);

    // 查询用户是否关注
    boolean queryIfFollow(String userId, String fanId);

    // 查询用户是否喜欢点赞视频
    boolean isUserLikeVideo(String userId, String videoId);
}
