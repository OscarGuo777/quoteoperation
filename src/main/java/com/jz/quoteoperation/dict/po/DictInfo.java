package com.jz.quoteoperation.dict.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DictInfo implements Serializable {
    private Integer lgcSn;

    private String dictCd;

    private String dictNm;

    private String status;

    private Date crtDt;

    private Integer crtUsrId;

    private Date updDt;

    private Integer updUsrId;

    private List<DictDetail> dictDetailList;

    public List<DictDetail> getDictDetailList() {
        return dictDetailList;
    }

    public void setDictDetailList(List<DictDetail> dictDetailList) {
        this.dictDetailList = dictDetailList;
    }

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getDictCd() {
        return dictCd;
    }

    public void setDictCd(String dictCd) {
        this.dictCd = dictCd == null ? null : dictCd.trim();
    }

    public String getDictNm() {
        return dictNm;
    }

    public void setDictNm(String dictNm) {
        this.dictNm = dictNm == null ? null : dictNm.trim();
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