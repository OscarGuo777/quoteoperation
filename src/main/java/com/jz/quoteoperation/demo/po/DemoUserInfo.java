package com.jz.quoteoperation.demo.po;

import java.util.Date;

public class DemoUserInfo {
    private Integer lgcSn;

    private String openId;

    private Integer usrAcnt;

    private String usrPwd;

    private String usrNm;

    private String usrMobi;

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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getUsrAcnt() {
        return usrAcnt;
    }

    public void setUsrAcnt(Integer usrAcnt) {
        this.usrAcnt = usrAcnt;
    }

    public String getUsrPwd() {
        return usrPwd;
    }

    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd == null ? null : usrPwd.trim();
    }

    public String getUsrNm() {
        return usrNm;
    }

    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm == null ? null : usrNm.trim();
    }

    public String getUsrMobi() {
        return usrMobi;
    }

    public void setUsrMobi(String usrMobi) {
        this.usrMobi = usrMobi == null ? null : usrMobi.trim();
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