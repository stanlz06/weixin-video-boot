package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Comments {
    @Id
    private String id;

    @Column(name = "father_comment_id")
    private String fatherCommentId;

    @Column(name = "to_user_id")
    private String toUserId;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "from_user_id")
    private String fromUserId;

    @Column(name = "create_time")
    private Date createTime;

    private String comment;
}