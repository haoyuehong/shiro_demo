package com.shrio.demo.mapper;

import com.shrio.demo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: MOL
 * @Description: 用户数据访问层接口
 * @Date: Create in 23:03 2018/1/7
 * @Modified:
 **/
public interface UserMapper {
    /**
     * 根据用户名查找用户
     * @param userName 用户名
     * @return 与用户名匹配的用户
     */
    User findByUserName(@Param("userName") String userName);
}
