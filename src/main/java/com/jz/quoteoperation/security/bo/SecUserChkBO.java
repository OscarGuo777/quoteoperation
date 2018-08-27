package com.jz.quoteoperation.security.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jz.quoteoperation.role.bo.RoleInfoBO;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecUserChkBO extends UserInfoBO implements UserDetails {
    private final String id;
    //帐号,这里是我数据库里的字段
    private final String account;
    //密码
    private final String password;

    public SecUserChkBO(String id, String account, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    //返回分配给用户的角色列表
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        List<RoleInfoBO> roles = this.getRole_list();
        for (RoleInfoBO role : roles) {
            auths.add(new SimpleGrantedAuthority(role.getRoleNm()));
        }
        return auths;
    }

    @JsonIgnore
    public String getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    //虽然我数据库里的字段是 `account`  ,这里还是要写成 `getUsername()`,因为是继承的接口
    @Override
    public String getUsername() {
        return account;
    }
    // 账户是否未过期
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    // 账户是否未锁定
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    // 密码是否未过期
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    // 账户是否激活
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
