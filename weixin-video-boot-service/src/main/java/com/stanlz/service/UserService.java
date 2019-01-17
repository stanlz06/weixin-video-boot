package com.stanlz.service;

import com.stanlz.entity.Users;

public interface UserService {
    // 判断用户名是否存在
    boolean queryUsernameIsExist(String username);

    // 保存用户
    void saveUser(Users user);

    // 判断用户是否存在
    Users queryUserForLogin(String username,String password);
}
