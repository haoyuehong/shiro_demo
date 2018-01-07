package com.shrio.demo.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: MOL
 * @Description: User实体类
 * @Date: Create in 22:55 2018/1/7
 * @Modified:
 **/
public class User {
    private Integer uid;
    private String userName;
    private String password;
    private Set<Role> roles = new HashSet<>();

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
