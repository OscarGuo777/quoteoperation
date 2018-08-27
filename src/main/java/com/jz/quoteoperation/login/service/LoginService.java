package com.jz.quoteoperation.login.service;

public interface LoginService {
    /**
     * 刷新缓存
     */
    public void refreshCache();

    /**
     * 注销
     */
    public void clearAuthentication();
}
