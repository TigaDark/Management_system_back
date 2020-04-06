package com.dgut.ye.system.controller.menu;

import com.dgut.ye.system.bean.Menu;
import com.dgut.ye.system.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/03/28
 **/
@RestController
@RequestMapping("/system/config")
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenuByHrId(){
        return menuService.getMenuByHrId();
    }
}
