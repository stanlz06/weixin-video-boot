package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users_like_videos")
@Data
public class UsersLikeVideos {
    /* 主键Id */
    @Id
    private String id;

    /* 点赞的用户Id */
    @Column(name = "user_id")
    private String userId;

    /* 被点赞的视频Id */
    @Column(name = "video_id")
    private String videoId;

}