package com.jz.quoteoperation.auth.po;

import java.io.Serializable;
import java.util.Date;

public class AuthInfo implements Serializable {
    private Integer lgcSn;

    private String authCd;

    private String authNm;

    private String status;

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

    public String getAuthCd() {
        return authCd;
    }

    public void setAuthCd(String authCd) {
        this.authCd = authCd == null ? null : authCd.trim();
    }

    public String getAuthNm() {
        return authNm;
    }

    public void setAuthNm(String authNm) {
        this.authNm = authNm == null ? null : authNm.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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