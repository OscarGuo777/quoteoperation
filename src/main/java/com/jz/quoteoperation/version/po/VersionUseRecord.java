package com.jz.quoteoperation.version.po;

import java.io.Serializable;
import java.util.Date;

public class VersionUseRecord implements Serializable {
    private Integer lgcSn;

    private String vrsnSn;

    private Integer useUsrId;

    private Date useTm;

    private String useTpcd;

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getVrsnSn() {
        return vrsnSn;
    }

    public void setVrsnSn(String vrsnSn) {
        this.vrsnSn = vrsnSn == null ? null : vrsnSn.trim();
    }

    public Integer getUseUsrId() {
        return useUsrId;
    }

    public void setUseUsrId(Integer useUsrId) {
        this.useUsrId = useUsrId;
    }

    public Date getUseTm() {
        return useTm;
    }

    public void setUseTm(Date useTm) {
        this.useTm = useTm;
    }

    public String getUseTpcd() {
        return useTpcd;
    }

    public void setUseTpcd(String useTpcd) {
        this.useTpcd = useTpcd == null ? null : useTpcd.trim();
    }
}