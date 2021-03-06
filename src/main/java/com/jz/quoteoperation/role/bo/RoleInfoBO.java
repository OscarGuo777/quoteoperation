package com.jz.quoteoperation.role.bo;

import com.jz.quoteoperation.auth.bo.AuthInfoBO;
import com.jz.quoteoperation.auth.po.AuthInfo;

import java.io.Serializable;
import java.util.List;

public class RoleInfoBO  implements Serializable {
    private String roleNm;
    private String status;
    private List<AuthInfoBO> auth_list;

    public String getRoleNm() {
        return roleNm;
    }

    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<AuthInfoBO> getAuth_list() {
        return auth_list;
    }

    public void setAuth_list(List<AuthInfoBO> auth_list) {
        this.auth_list = auth_list;
    }
}
