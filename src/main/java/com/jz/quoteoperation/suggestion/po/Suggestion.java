package com.jz.quoteoperation.suggestion.po;

import java.io.Serializable;
import java.util.Date;

public class Suggestion implements Serializable {
    private Integer lgcSn;

    private Integer sgtnUsrId;

    private String sgtnTpcd;

    private String sgtnCntnt;

    private Date crtDt;

    private Integer rplyUsrId;

    private String rplyCntnt;

    private Date rplyDt;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public Integer getSgtnUsrId() {
        return sgtnUsrId;
    }

    public void setSgtnUsrId(Integer sgtnUsrId) {
        this.sgtnUsrId = sgtnUsrId;
    }

    public String getSgtnTpcd() {
        return sgtnTpcd;
    }

    public void setSgtnTpcd(String sgtnTpcd) {
        this.sgtnTpcd = sgtnTpcd == null ? null : sgtnTpcd.trim();
    }

    public String getSgtnCntnt() {
        return sgtnCntnt;
    }

    public void setSgtnCntnt(String sgtnCntnt) {
        this.sgtnCntnt = sgtnCntnt == null ? null : sgtnCntnt.trim();
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Integer getRplyUsrId() {
        return rplyUsrId;
    }

    public void setRplyUsrId(Integer rplyUsrId) {
        this.rplyUsrId = rplyUsrId;
    }

    public String getRplyCntnt() {
        return rplyCntnt;
    }

    public void setRplyCntnt(String rplyCntnt) {
        this.rplyCntnt = rplyCntnt == null ? null : rplyCntnt.trim();
    }

    public Date getRplyDt() {
        return rplyDt;
    }

    public void setRplyDt(Date rplyDt) {
        this.rplyDt = rplyDt;
    }
}