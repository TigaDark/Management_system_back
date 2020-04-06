package com.dgut.ye.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  //允许所有接口
                .allowedOrigins("*")             // 所有请求来源
                .allowCredentials(true)
                .allowedMethods("*")             // 所有方法如 get post。。
                .maxAge(1000);                   // 探测请求存在的时间 如PUT等请求
    }
}
