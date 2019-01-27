package com.stanlz.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@ApiModel(value = "用户对象",description = "这是用户对象")
public class Users {
    /* 主键Id */
    @ApiModelProperty(hidden = true)
    @Id
    private String id;

    /* 用户名 */
    @ApiModelProperty(value = "用户名",name = "username",example = "videouser",required = true)
    private String username;

    /* 用户密码 */
    @ApiModelProperty(value = "密码",name = "password",example = "123456",required = true)
    private String password;

    /* 用户头像地址 */
    @ApiModelProperty(hidden = true)
    @Column(name = "face_image")
    private String faceImage;

    /* 用户昵称 */
    @ApiModelProperty(hidden = true)
    private String nickname;

    /* 用户粉丝数量 */
    @ApiModelProperty(hidden = true)
    @Column(name = "fans_counts")
    private Integer fansCounts;

    /* 用户关注的总人数 */
    @ApiModelProperty(hidden = true)
    @Column(name = "follow_counts")
    private Integer followCounts;

    /* 用户收到点赞/收藏的数量 */
    @ApiModelProperty(hidden = true)
    @Column(name = "receive_like_counts")
    private Integer receiveLikeCounts;
}