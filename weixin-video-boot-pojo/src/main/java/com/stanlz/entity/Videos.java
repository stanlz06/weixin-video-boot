package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Videos {
    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "audio_id")
    private String audioId;

    @Column(name = "video_desc")
    private String videoDesc;

    @Column(name = "video_path")
    private String videoPath;

    @Column(name = "video_seconds")
    private Float videoSeconds;

    @Column(name = "video_width")
    private Integer videoWidth;

    @Column(name = "video_height")
    private Integer videoHeight;

    @Column(name = "cover_path")
    private String coverPath;

    @Column(name = "like_counts")
    private Long likeCounts;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;
}