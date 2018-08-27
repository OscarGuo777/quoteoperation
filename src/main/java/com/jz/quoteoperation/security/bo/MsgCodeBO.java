package com.jz.quoteoperation.security.bo;

public enum  MsgCodeBO {
    INVALID_CLIENTID(30003, "Invalid clientid"),
    INVALID_PASSWORD(30004, "User name or password is incorrect"),
    INVALID_CAPTCHA(30005, "Invalid captcha or captcha overdue"),
    INVALID_TOKEN(30006, "Invalid token");
    private int code;
    private String msg;
    private MsgCodeBO(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
