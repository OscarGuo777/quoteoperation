package com.jz.quoteoperation.wechat.po;

import java.io.Serializable;

/**
 * 微信配置类
 */
public class WechatConfig implements Serializable {
    private Integer lgcSn;

    private String appKey;

    private String appSercet;

    private String followWelcoming;//关注时触发欢迎语并发送

    public Integer getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Integer lgcSn) {
        this.lgcSn = lgcSn;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getAppSercet() {
        return appSercet;
    }

    public void setAppSercet(String appSercet) {
        this.appSercet = appSercet == null ? null : appSercet.trim();
    }

    public String getFollowWelcoming() {
        return followWelcoming;
    }

    public void setFollowWelcoming(String followWelcoming) {
        this.followWelcoming = followWelcoming == null ? null : followWelcoming.trim();
    }
}