package com.dgut.ye.system.service.menu;

import com.dgut.ye.system.bean.Hr;
import com.dgut.ye.system.bean.Menu;
import com.dgut.ye.system.config.SecurityConfig;
import com.dgut.ye.system.mapper.MenuMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/03/28
 **/
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenuByHrId() {
        return menuMapper.getMenuByHrId(((Hr) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal())
                .getId());
    }
}
