package com.dgut.ye.system.controller;

import com.dgut.ye.system.bean.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DGUT.YE
 * @date : 2020/03/24
 **/
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录,请登录!");
    }
}
