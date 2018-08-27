package com.jz.quoteoperation.login.service.impl;

import com.jz.quoteoperation.common.util.JedisClientUtil;
import com.jz.quoteoperation.dict.service.DictService;
import com.jz.quoteoperation.login.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service(value = "loginService")
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DictService dictService;
    @Autowired
    private JedisClientUtil jedisClient;

    @Override
    public void refreshCache() {
        jedisClient.clearCache();
        dictService.selectDictAllByCode(null);
    }

    @Override
    public void clearAuthentication() {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession(false);
        if (session != null) {
            this.logger.debug("Invalidating session: " + session.getId());
            session.invalidate();
        }
        SecurityContext context = SecurityContextHolder.getContext();
        context.setAuthentication((Authentication)null);
        SecurityContextHolder.clearContext();
    }
}
