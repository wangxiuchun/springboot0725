package com.aaa.service;

import com.aaa.dao.UserDao;
import com.aaa.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }

}
