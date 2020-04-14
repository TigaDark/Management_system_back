package com.dgut.ye.system.config;

import com.dgut.ye.system.bean.Menu;
import com.dgut.ye.system.bean.Role;
import com.dgut.ye.system.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/04/07
 * 根据用户请求数据的url 去找到该url所需要的权限 看用户是否具有这个权限
 * 这个类的作用仅仅是找到对应url 所需要的权限返回
 **/
@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    /**
     * 请求地址 匹配工具
     */
    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<Menu> menus = menuService.getAllMenuWithRoles();
        for (Menu menu : menus) {
            //  如果匹配到对应路径 就找它的权限 并返回
            if (antPathMatcher.match(menu.getUrl(),requestUrl)){
                List<Role> roles = menu.getRoles();
                String[] str = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    str[i]=roles.get(i).getName();
                }
                return SecurityConfig.createList(str);
            }
        }
        // 如果匹配不到路径呢？ 如果不给访问那就返回null处理 这里是你登录了 就给你访问 这里返回的仅仅是标记 让你知道这个url没有匹配上
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
