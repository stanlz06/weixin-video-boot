package com.stanlz.entity.vo;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
public class VideosVO {
    /* 主键Id */
    private String id;

    /* 发布者的用户Id */
    private String userId;

    /* 视频使用的BgmId */
    private String audioId;

    /* 视频描述信息 */
    private String videoDesc;

    /* 视频保存的路径 */
    private String videoPath;

    /* 视频的时间长度 */
    private Float videoSeconds;

    /* 视频的时间长度 */
    private Integer videoWidth;

    /* 视频高度 */
    private Integer videoHeight;

    /* 视频封面图路径 */
    private String coverPath;

    /* 视频被点赞的数量 */
    private Long likeCounts;

    /* 视频状态 */
    private Integer status;

    /* 创建时间 */
    private Date createTime;

    /* 发布者头像 */
    private String faceImage;

    /* 发布者昵称 */
    private String nickname;
}