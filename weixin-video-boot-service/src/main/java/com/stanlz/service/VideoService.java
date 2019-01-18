package com.stanlz.service;

import com.stanlz.entity.Videos;

public interface VideoService {
    // 保存视频
    String saveVideo(Videos video);

    // 修改视频的封面
    void updateVideo(String videoId, String coverPath);
}
