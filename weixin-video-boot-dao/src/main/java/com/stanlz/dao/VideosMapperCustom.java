package com.stanlz.dao;

import java.util.List;

import com.stanlz.entity.Videos;
import com.stanlz.entity.vo.VideosVO;
import com.stanlz.utils.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideosMapperCustom extends MyMapper<Videos> {
	
	// 条件查询所有视频列表
	List<VideosVO> queryAllVideos(@Param("videoDesc") String videoDesc, @Param("userId") String userId);

	// 对视频喜欢的数量进行累加
	void addVideoLikeCount(@Param("videoId") String videoId);

	// 对视频喜欢的数量进行累减
	void reduceVideoLikeCount(@Param("videoId") String videoId);

	// 查询我关注的人发的视频
	List<VideosVO> queryMyFollowVideos(@Param("userId") String userId);

	// 查询点赞过的视频
	List<VideosVO> queryMyLikeVideos(@Param("userId") String userId);
}