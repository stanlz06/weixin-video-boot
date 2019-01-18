package com.stanlz.dao;

import com.stanlz.entity.SearchRecords;
import com.stanlz.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
    // 查询热搜词
    List<String> getHotwords();
}