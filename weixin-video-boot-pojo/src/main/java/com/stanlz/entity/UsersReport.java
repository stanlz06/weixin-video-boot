package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "users_report")
@Data
public class UsersReport {
    /* 主键Id */
    @Id
    private String id;

    /* 被举报的用户Id */
    @Column(name = "deal_user_id")
    private String dealUserId;

    /* 被举报的视频Id */
    @Column(name = "deal_video_id")
    private String dealVideoId;

    /* 举报标题 */
    private String title;

    /* 举报的详细描述信息 */
    private String content;

    /* 举报人的Id */
    private String userid;

    /* 举报时间 */
    @Column(name = "create_date")
    private Date createDate;
}