package com.stanlz.entity.vo;

import java.util.Date;
import javax.persistence.*;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class CommentsVO {
    /* 主键Id */
    private String id;

    /* 视频Id */
    private String videoId;

    /* 评论者，留言者的用户Id */
    private String fromUserId;

    /* 评论时间 */
    private Date createTime;

    /* 评论内容 */
    private String comment;

    /* 评论者的头像 */
    private String faceImage;

    /* 评论者的昵称 */
    private String nickname;

    /* 被评论留言的用户Id */
    private String toNickname;

    private String timeAgoStr;
}