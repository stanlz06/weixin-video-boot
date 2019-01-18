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
	List<VideosVO> queryAllVideos(@Param("videoDesc") String videoDesc,
								  @Param("userId") String userId);
}