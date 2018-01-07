package com.shrio.demo.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: MOL
 * @Description: 角色实体类
 * @Date: Create in 22:56 2018/1/7
 * @Modified:
 **/
public class Role {
    private Integer rid;
    private String name;
    private Set<Permission> permissions = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
