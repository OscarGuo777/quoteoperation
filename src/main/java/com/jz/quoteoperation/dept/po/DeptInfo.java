package com.jz.quoteoperation.dept.po;

import java.io.Serializable;
import java.util.Date;

public class DeptInfo implements Serializable {

    private Integer lgcSn;

    private String deptNm;

    private Integer prntSn;

    private Date crtDt;

    private Integer crtUsrId;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm == null ? null : deptNm.trim();
    }

    public Integer getPrntSn() {
        return prntSn;
    }

    public void setPrntSn(Integer prntSn) {
        this.prntSn = prntSn;
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
}