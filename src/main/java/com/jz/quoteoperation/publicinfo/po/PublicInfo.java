package com.jz.quoteoperation.publicinfo.po;

import java.io.Serializable;
import java.util.Date;


public class PublicInfo implements Serializable {
    private Integer lgcSn;

    private Date crtDt;

    private Integer crtUsrId;

    private String infoTpcd;

    private String infoTitle;

    private String infoCntnt;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
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

    public String getInfoTpcd() {
        return infoTpcd;
    }

    public void setInfoTpcd(String infoTpcd) {
        this.infoTpcd = infoTpcd == null ? null : infoTpcd.trim();
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle == null ? null : infoTitle.trim();
    }

    public String getInfoCntnt() {
        return infoCntnt;
    }

    public void setInfoCntnt(String infoCntnt) {
        this.infoCntnt = infoCntnt == null ? null : infoCntnt.trim();
    }
}