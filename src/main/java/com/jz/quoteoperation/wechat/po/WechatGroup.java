package com.jz.quoteoperation.wechat.po;

import java.util.Date;

public class WechatGroup {
    private String lgcSn;

    private String groupname;

    private String crtUsrId;

    private Date crtDt;

    private String uptUsrId;

    private Date uptDt;

    public String getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(String lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getCrtUsrId() {
        return crtUsrId;
    }

    public void setCrtUsrId(String crtUsrId) {
        this.crtUsrId = crtUsrId == null ? null : crtUsrId.trim();
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public String getUptUsrId() {
        return uptUsrId;
    }

    public void setUptUsrId(String uptUsrId) {
        this.uptUsrId = uptUsrId == null ? null : uptUsrId.trim();
    }

    public Date getUptDt() {
        return uptDt;
    }

    public void setUptDt(Date uptDt) {
        this.uptDt = uptDt;
    }
}