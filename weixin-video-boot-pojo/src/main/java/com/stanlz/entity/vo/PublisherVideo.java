package com.stanlz.entity.vo;


import lombok.Data;

@Data
public class PublisherVideo {
	/* 发布者信息 */
	public UsersVO publisher;

	/* 用户是否点赞过该视频 */
	public boolean userLikeVideo;
}