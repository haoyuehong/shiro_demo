package com.shrio.demo.service;

import com.shrio.demo.model.User;

/**
 * @Author: MOL
 * @Description: 用户业务逻辑层接口
 * @Date: Create in 23:06 2018/1/7
 * @Modified:
 **/
public interface UserService {
    /**
     * 根据用户查找用户
     * @param userName 用户名
     * @return 与用户名匹配的用户
     */
    User findByUserName(String userName);
}
