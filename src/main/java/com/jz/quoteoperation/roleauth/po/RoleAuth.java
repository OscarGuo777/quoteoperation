package com.jz.quoteoperation.roleauth.po;

import java.io.Serializable;
import java.util.Date;

public class RoleAuth implements Serializable {
    private Integer lgcSn;

    private Integer authSn;

    private Integer roleSn;

    private Date crtDt;

    private Integer crtUsrId;

    private Date updDt;

    private Integer updUsrId;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public Integer getAuthSn() {
        return authSn;
    }

    public void setAuthSn(Integer authSn) {
        this.authSn = authSn;
    }

    public Integer getRoleSn() {
        return roleSn;
    }

    public void setRoleSn(Integer roleSn) {
        this.roleSn = roleSn;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Integer getCrtUsrId() {
        return crtUsrId;
    }

    public void setCrtUsrId(Integer crtUsrId) {
        this.crtUsrId = crtUsrId;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    public Integer getUpdUsrId() {
        return updUsrId;
    }

    public void setUpdUsrId(Integer updUsrId) {
        this.updUsrId = updUsrId;
    }
}