package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Comments {
    /* 主键Id */
    @Id
    private String id;

    /*  回复的评论的Id*/
    @Column(name = "father_comment_id")
    private String fatherCommentId;

    /* 回复的评论的用户Id */
    @Column(name = "to_user_id")
    private String toUserId;

    /* 视频Id */
    @Column(name = "video_id")
    private String videoId;

    /* 留言者，评论者的Id */
    @Column(name = "from_user_id")
    private String fromUserId;

    /* 创建视频 */
    @Column(name = "create_time")
    private Date createTime;

    /* 评论内容 */
    private String comment;
}