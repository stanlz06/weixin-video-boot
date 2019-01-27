package com.stanlz.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Data
public class UsersVO {
    /* 主键Id */
    private String id;

    /* 用户的Token值 */
	private String userToken;

    /* 是否关注 */
	private boolean isFollow;

    /* 用户名 */
    private String username;

    /* 用户密码 */
    @JsonIgnore
    private String password;

    /* 用户头像地址 */
    private String faceImage;

    /* 用户昵称 */
    private String nickname;

    /* 用户粉丝数量 */
    private Integer fansCounts;

    /* 用户关注的总人数 */
    private Integer followCounts;

    /* 用户收到点赞/收藏的数量 */
    private Integer receiveLikeCounts;
}