package com.dgut.ye.system.config;

import com.dgut.ye.system.bean.Hr;
import com.dgut.ye.system.bean.RespBean;
import com.dgut.ye.system.service.HrService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.io.PrintWriter;

/**
 * @author : DGUT.YE
 * @date : 2020/03/24
 **/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    HrService hrService;

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(hrService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/doLogin")
                //如果没有登录 跳转到/login但是前后分离 注意一般不用后端返回界面  直接返回json
                //所有/lgoin应该返回JSON
                .loginPage("/login")
                .successHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter out = httpServletResponse.getWriter();
                    Hr hr = (Hr) authentication.getPrincipal();
                    //有密码字段 不应该返回没密码字段
                    hr.setPassword(null);
                    RespBean ok = RespBean.ok("登录成功", hr);
                    String s = new ObjectMapper().writeValueAsString(ok);
                    out.write(s);
                    out.flush();
                    out.close();

                })
                .failureHandler((httpServletRequest, httpServletResponse, e) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter out = httpServletResponse.getWriter();
                    RespBean respBean = RespBean.error("登录失败!");
                    if (e instanceof LockedException){
                        respBean.setMsg("账户被锁定,请联系管理员!");
                    }else if (e instanceof CredentialsExpiredException){
                        respBean.setMsg("密码过期,请联系管理员!");
                    }else if (e instanceof AccountExpiredException){
                        respBean.setMsg("账户过期,请联系管理员!");
                    }else if (e instanceof DisabledException){
                        respBean.setMsg("账户被禁用,请联系管理员!");
                    }else if (e instanceof BadCredentialsException){
                        respBean.setMsg("用户名或者密码输入错误,请重新输入!");
                    }
                    out.write(new ObjectMapper().writeValueAsString(respBean));
                    out.flush();
                    out.close();
                })
                .permitAll()
                .and()
                .logout()
                .logoutSuccessHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter out = httpServletResponse.getWriter();
                    out.write(new ObjectMapper().writeValueAsString(RespBean.ok("注销成功！")));
                })
                .permitAll()
                .and()
                .csrf().disable()
                .cors();
    }
}
