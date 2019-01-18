package com.stanlz.controller;

import com.stanlz.service.BgmService;
import com.stanlz.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 背景音乐业务的controller
 */

@RestController
@Api(tags= {"BgmController"},description="背景音乐业务的接口")
@RequestMapping("/bgm")
public class BgmController {
    @Autowired
    private BgmService bgmService;

    @ApiOperation(value="获取背景音乐列表")
    @PostMapping("/list")
    public JSONResult list() {
        return JSONResult.ok(bgmService.queryBgmList());
    }
}
