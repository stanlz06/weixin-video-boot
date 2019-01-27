package com.stanlz.service;

import com.stanlz.entity.Comments;
import com.stanlz.entity.Videos;
import com.stanlz.utils.PagedResult;

import java.util.List;

public interface VideoService {
    /* 保存视频 */
    String saveVideo(Videos video);

    /* 修改视频的封面 */
    void updateVideo(String videoId, String coverPath);

    /* 分页查询视频列表 */
    PagedResult getAllVideos(Videos video, Integer isSaveRecord, Integer page, Integer pageSize);

    /* 获取热搜词列表 */
    List<String> getHotwords();

    /* 用户喜欢/点赞视频 */
    void userLikeVideo(String userId, String videoId, String videoCreaterId);

    /* 用户不喜欢/取消点赞视频 */
    void userUnLikeVideo(String userId, String videoId, String videoCreaterId);

    /* 查询我喜欢的视频列表 */
    PagedResult queryMyLikeVideos(String userId, Integer page, Integer pageSize);

    /* 查询我关注的人的视频列表 */
    PagedResult queryMyFollowVideos(String userId, Integer page, Integer pageSize);

    /* 用户留言*/
    void saveComment(Comments comment);

    /* 留言分页 */
    PagedResult getAllComments(String videoId, Integer page, Integer pageSize);
}
