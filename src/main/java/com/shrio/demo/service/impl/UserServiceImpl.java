package com.shrio.demo.service.impl;

import com.shrio.demo.mapper.UserMapper;
import com.shrio.demo.model.User;
import com.shrio.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: MOL
 * @Description: 用户业务逻辑层实现类
 * @Date: Create in 23:09 2018/1/7
 * @Modified:
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}
