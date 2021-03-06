package com.jz.quoteoperation.user.bo;

import com.jz.quoteoperation.role.bo.RoleInfoBO;

import java.io.Serializable;
import java.util.List;

public class UserInfoBO implements Serializable {
    //serialVersionUID = -4808890421695804291, local class serialVersionUID = -4871521950035993223
    private static final long serialVersionUID = -4808890421695804291L;

    private Integer lgcSn;

    private String openId;

    private String usrAcnt;

    private String usrPwd;

    private String usrNm;

    private String usrMobi;

    private String usrMail;

    private String status;

    private List<RoleInfoBO> role_list;

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
        this.openId = openId;
    }

    public String getUsrAcnt() {
        return usrAcnt;
    }

    public void setUsrAcnt(String usrAcnt) {
        this.usrAcnt = usrAcnt;
    }

    public String getUsrPwd() {
        return usrPwd;
    }

    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd;
    }

    public String getUsrNm() {
        return usrNm;
    }

    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }

    public String getUsrMobi() {
        return usrMobi;
    }

    public void setUsrMobi(String usrMobi) {
        this.usrMobi = usrMobi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RoleInfoBO> getRole_list() {
        return role_list;
    }

    public void setRole_list(List<RoleInfoBO> role_list) {
        this.role_list = role_list;
    }

    public String getUsrMail() {
        return usrMail;
    }

    public void setUsrMail(String usrMail) {
        this.usrMail = usrMail;
    }
}
