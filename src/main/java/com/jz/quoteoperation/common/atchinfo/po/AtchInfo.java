package com.jz.quoteoperation.common.atchinfo.po;


import java.io.Serializable;

public class AtchInfo implements Serializable {
    private Integer lgcSn;

    private String atchNm;

    private String atchPath;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getAtchNm() {
        return atchNm;
    }

    public void setAtchNm(String atchNm) {
        this.atchNm = atchNm == null ? null : atchNm.trim();
    }

    public String getAtchPath() {
        return atchPath;
    }

    public void setAtchPath(String atchPath) {
        this.atchPath = atchPath == null ? null : atchPath.trim();
    }
}
