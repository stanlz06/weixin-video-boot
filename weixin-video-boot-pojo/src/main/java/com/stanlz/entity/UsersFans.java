package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users_fans")
@Data
public class UsersFans {
    /* 主键Id */
    @Id
    private String id;

    /* 被关注的用户Id */
    @Column(name = "user_id")
    private String userId;

    /* 粉丝的用户Id */
    @Column(name = "fan_id")
    private String fanId;
}