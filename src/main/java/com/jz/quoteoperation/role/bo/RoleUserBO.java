package com.jz.quoteoperation.role.bo;

import java.util.Date;

public class RoleUserBO {
    private String platCd;

    private Integer lgcSn;

    private String roleNm;

    private String status;

    private Date crtDt;

    private Integer crtUsrId;

    private Date updDt;

    private Integer updUsrId;

    private String usrAcnt;

    public String getPlatCd() {
        return platCd;
    }

    public void setPlatCd(String platCd) {
        this.platCd = platCd;
    }

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

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

    public String getUsrAcnt() {
        return usrAcnt;
    }

    public void setUsrAcnt(String usrAcnt) {
        this.usrAcnt = usrAcnt;
    }
}
