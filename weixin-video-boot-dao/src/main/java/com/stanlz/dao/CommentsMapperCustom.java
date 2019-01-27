package com.stanlz.dao;

import java.util.List;

import com.stanlz.entity.Comments;
import com.stanlz.entity.vo.CommentsVO;
import com.stanlz.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsMapperCustom extends MyMapper<Comments> {
	/* 获取评论列表 */
	List<CommentsVO> queryComments(String videoId);
}