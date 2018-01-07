package com.shrio.demo.model;

/**
 * @Author: MOL
 * @Description: 权限实体类
 * @Date: Create in 22:57 2018/1/7
 * @Modified:
 **/
public class Permission {
    private Integer pid;
    private String name;
    private String url;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
