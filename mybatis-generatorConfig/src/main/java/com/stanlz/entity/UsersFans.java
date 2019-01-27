package com.stanlz.entity;

import javax.persistence.*;

@Table(name = "users_fans")
public class UsersFans {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 用户
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 粉丝
     */
    @Column(name = "fan_id")
    private String fanId;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户
     *
     * @return user_id - 用户
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户
     *
     * @param userId 用户
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取粉丝
     *
     * @return fan_id - 粉丝
     */
    public String getFanId() {
        return fanId;
    }

    /**
     * 设置粉丝
     *
     * @param fanId 粉丝
     */
    public void setFanId(String fanId) {
        this.fanId = fanId;
    }
}