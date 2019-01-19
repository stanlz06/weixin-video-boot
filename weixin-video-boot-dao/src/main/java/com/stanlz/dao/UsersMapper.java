package com.stanlz.dao;

import com.stanlz.entity.Users;
import com.stanlz.utils.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper extends MyMapper<Users> {
    // 用户受喜欢数累加
    void addReceiveLikeCount(@Param("userId") String userId);

    // 用户受喜欢数累减
    void reduceReceiveLikeCount(@Param("userId") String userId);

    // 增加粉丝数
    void addFansCount(@Param("userId") String userId);

    // 减少粉丝数
    void reduceFansCount(@Param("userId") String userId);

    // 增加关注数
    void addFollersCount(@Param("userId") String userId);

    // 减少关注数
    void reduceFollersCount(@Param("userId") String userId);
}