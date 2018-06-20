package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.tourism.dao.UserMapper;
import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.service.UserService;
import com.tdeado.tourism.utils.StringText;
import com.tdeado.tourism.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUserList(int page, int pagesize, User user) {
        PageHelper.startPage(page,pagesize);
        return userMapper.queryUser(user);
    }

    /**
     * 更新数据
     * @param newUser 新的bean
     * @return
     */
    @Transactional
    @Override
    public boolean updataUser(User newUser) {
        newUser.setRandcode("");
        newUser.setToken("");
        newUser.setAvater("");
        newUser.setRegtime(null);
        newUser.setBalance(null);
        newUser.setSetting(null);
        int i= userMapper.updateUser(newUser);
        if (i>0){
            return true;
        }
        return true;
    }

    @Override
    public boolean deleteUser(int userId) {
        User user = User.QueryBuild().userId(userId);
        user.setIsdelete(1);
        int i =userMapper.updateUser(user);
        if (i>0){
            return true;
        }
        throw new RuntimeException("删除用户失败");
    }

    @Override
    public User getUser(User user) {
        User u = userMapper.queryUserLimit1(user);
        if (null!=u && !"".equals(u.getUserName())){
            return u;
        }
        throw new RuntimeException("用户不存在，或者传入ID有误");
    }

    @Transactional
    @Override
    public User addUser(User user) {
        System.out.println(user.getUserName());
        if (!StringUtils.isEmpty(user.getUserName())) {
            throw new RuntimeException(StringText.USERNAME_OR_MOBILE_NOT_EMPTY);
        } else if (!StringUtils.isEmpty(user.getUserName())) {
            throw new RuntimeException(StringText.USERNAME_OR_MOBILE_NOT_EMPTY);
        } else if (!StringUtils.isEmpty(user.getPassword())) {
            throw new RuntimeException(StringText.PASSWORD_NOT_EMPTY);
        } else {
            int i = userMapper.insertUser(user);
            if (i > 0) {
                return user;
            } else {
                throw new RuntimeException(StringText.USER_ADD_FAIL);
            }
        }
    }

    @Override
    public User login(String username, String password) {

        if (!StringUtils.isEmpty(username)) {
            throw new RuntimeException(StringText.USERNAME_OR_MOBILE_NOT_EMPTY);
        } else if (!StringUtils.isEmpty(password)) {
            throw new RuntimeException(StringText.PASSWORD_NOT_EMPTY);
        } else {
            User user = userMapper.queryUserLimit1(User.QueryBuild().userName(username));

            if (null == user || "".equals(user.getUserName())) {
                user = userMapper.queryUserLimit1(User.QueryBuild().userName(username));
                if (null != user && !"".equals(user.getUserName())) {
                    if (user.getPassword().equals(password)) {
                        return user;
                    } else {
                        throw new RuntimeException(StringText.PASSWORD_ERROR);
                    }
                }else {
                    throw new RuntimeException(StringText.USER_NOT_EXIST);
                }
            } else {
                if (user.getPassword().equals(password)) {
                    return user;
                } else {
                    throw new RuntimeException(StringText.PASSWORD_ERROR);
                }
            }

        }
    }


}
