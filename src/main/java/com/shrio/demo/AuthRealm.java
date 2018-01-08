package com.shrio.demo;

import com.shrio.demo.model.Permission;
import com.shrio.demo.model.Role;
import com.shrio.demo.model.User;
import com.shrio.demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author: MOL
 * @Description:
 * @Date: Create in 23:21 2018/1/8
 * @Modified:
 **/
public class AuthRealm extends AuthorizingRealm{
    @Autowired
    private UserService userService;
    /**
     * 作为授权使用
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissionList = new ArrayList<>();
        Set<Role> roles = user.getRoles();
        if(CollectionUtils.isEmpty(roles)){
            for(Role role : roles){
                Set<Permission> permissions = role.getPermissions();
                if(CollectionUtils.isEmpty(permissions)){
                    for (Permission permission : permissions){
                        permissionList.add(permission.getName());
                    }
                }
            }
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);
        return info;
    }

    /**
     * 认证登录使用
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        String username = usernamePasswordToken.getUsername();
        User user = userService.findByUserName(username);
        return new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getName());
    }
}
