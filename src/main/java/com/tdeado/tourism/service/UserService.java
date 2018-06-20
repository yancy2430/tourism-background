package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 获取用户列表
     * @param page
     * @param pagesize
     * @param user
     * @return
     */
    List<User> getUserList(int page, int pagesize, User user);
    /**
     * 编辑用户信息
     */

    boolean updataUser(User newUser);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    boolean deleteUser(int userId);

    User getUser(User user);

    /**
     * 添加用户
     * @return
     */
    User addUser(User user);

    /**
     * 用户登录
     * @param username
     * @param password
     */
    User login(String username, String password);


}
