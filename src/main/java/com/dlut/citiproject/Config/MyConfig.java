package com.dlut.citiproject.Config;

import com.dlut.citiproject.Config.SessionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

/**
 * @author:dzc
 * @date2020-10-11 10:10
 */

@Configuration
public class MyConfig {
    @Bean
    public FilterRegistrationBean FilterRegistration() {
        // 建立过滤器
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 添加我们写好的过滤器
        registration.setFilter(new SessionFilter());
        // 设置过滤器的URL模式
        registration.addUrlPatterns("/*");
        return registration;
    }
}