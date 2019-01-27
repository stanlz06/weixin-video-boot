package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Videos {
    /* 主键Id */
    @Id
    private String id;

    /* 发布者的用户Id */
    @Column(name = "user_id")
    private String userId;

    /* 视频使用的BgmId */
    @Column(name = "audio_id")
    private String audioId;

    /* 视频描述信息 */
    @Column(name = "video_desc")
    private String videoDesc;

    /* 视频保存的路径 */
    @Column(name = "video_path")
    private String videoPath;

    /* 视频的时间长度 */
    @Column(name = "video_seconds")
    private Float videoSeconds;

    /* 视频宽度 */
    @Column(name = "video_width")
    private Integer videoWidth;

    /* 视频高度 */
    @Column(name = "video_height")
    private Integer videoHeight;

    /* 视频封面图路径 */
    @Column(name = "cover_path")
    private String coverPath;

    /* 视频被点赞的数量 */
    @Column(name = "like_counts")
    private Long likeCounts;

    /* 视频状态 */
    private Integer status;

    /* 创建时间 */
    @Column(name = "create_time")
    private Date createTime;
}