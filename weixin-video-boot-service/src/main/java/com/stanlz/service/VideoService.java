package com.stanlz.service;

import com.stanlz.entity.Videos;
import com.stanlz.utils.PagedResult;

import java.util.List;

public interface VideoService {
    // 保存视频
    String saveVideo(Videos video);

    // 修改视频的封面
    void updateVideo(String videoId, String coverPath);

    //分页查询视频列表
    PagedResult getAllVideos(Videos video, Integer isSaveRecord,
                             Integer page, Integer pageSize);

    //获取热搜词列表
    List<String> getHotwords();
}
