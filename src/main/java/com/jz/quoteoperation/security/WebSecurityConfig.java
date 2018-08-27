package com.jz.quoteoperation.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configurable
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    // Spring会自动寻找实现接口的类注入,会找到我们的 UserDetailsServiceImpl  类
    @Autowired
    private UserDetailsService userSecDetailsService;

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                // 设置UserDetailsService
                .userDetailsService(userSecDetailsService)
                // 使用BCrypt进行密码的hash
                .passwordEncoder(passwordEncoder());
    }

    // 装载BCrypt密码编码器
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSecDetailsService);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()//此处不能注释！！！！！！！！！！！！
                .authorizeRequests()
                // 允许对于网站静态资源的无授权访问
                .antMatchers(
                      "/*.css",
                        "/fonts/**",
                        "/*.js",
                        "/favicon.ico",
                        "/**/*.jpg",
                        "/**/*.css",
                        "/**/*.js",
                        "/register",
                        "/wechatAccess/index"
                ).permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login")
                .successForwardUrl("/userLogin")
                .failureUrl("/login?error").permitAll()
                //.and().rememberMe().tokenValiditySeconds(1209600)
                .and().logout().logoutUrl("/logout")
                .logoutSuccessUrl("/quit").permitAll();
    }

}
