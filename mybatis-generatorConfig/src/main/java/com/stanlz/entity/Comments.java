package com.stanlz.entity;

import java.util.Date;
import javax.persistence.*;

public class Comments {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 父评论id，被回复的评论
     */
    @Column(name = "father_comment_id")
    private String fatherCommentId;

    /**
     * 评论被回复的用户id
     */
    @Column(name = "to_user_id")
    private String toUserId;

    /**
     * 视频id
     */
    @Column(name = "video_id")
    private String videoId;

    /**
     * 留言者，评论的用户id
     */
    @Column(name = "from_user_id")
    private String fromUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 评论内容
     */
    private String comment;

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
     * 获取父评论id，被回复的评论
     *
     * @return father_comment_id - 父评论id，被回复的评论
     */
    public String getFatherCommentId() {
        return fatherCommentId;
    }

    /**
     * 设置父评论id，被回复的评论
     *
     * @param fatherCommentId 父评论id，被回复的评论
     */
    public void setFatherCommentId(String fatherCommentId) {
        this.fatherCommentId = fatherCommentId;
    }

    /**
     * 获取评论被回复的用户id
     *
     * @return to_user_id - 评论被回复的用户id
     */
    public String getToUserId() {
        return toUserId;
    }

    /**
     * 设置评论被回复的用户id
     *
     * @param toUserId 评论被回复的用户id
     */
    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    /**
     * 获取视频id
     *
     * @return video_id - 视频id
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * 设置视频id
     *
     * @param videoId 视频id
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    /**
     * 获取留言者，评论的用户id
     *
     * @return from_user_id - 留言者，评论的用户id
     */
    public String getFromUserId() {
        return fromUserId;
    }

    /**
     * 设置留言者，评论的用户id
     *
     * @param fromUserId 留言者，评论的用户id
     */
    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取评论内容
     *
     * @return comment - 评论内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置评论内容
     *
     * @param comment 评论内容
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}