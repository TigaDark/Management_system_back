package com.dgut.ye.system.config;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.AnonymousAuthenticationProvider;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author : DGUT.YE
 * @date : 2020/04/14
 **/
@Component
public class CustomDesicionManger implements AccessDecisionManager {

    /**
     *
     * @param authentication 用户的角色
     * @param object
     * @param configAttributes  你filter里面返回的Role 即 url需要的角色
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        for (ConfigAttribute configAttribute : configAttributes) {
            String needRole = configAttribute.getAttribute();
            // 如果路径没有匹配上 那就是要登陆就是可以访问的 这里的ROLE_LOGIN 仅仅是你filter返回来的一个标志而已
            if ("ROLE_LOGIN".equals(needRole)){
                // 用户未登录
                if (authentication instanceof AnonymousAuthenticationToken){
                    throw new AccessDeniedException("尚未登录，请登录！");
                }else {
                    return;
                }
            }
            // 这里是权限的判断  决定于业务逻辑  这个菜单所需要的权限 是 都要有 还是只要有一个就可以了呢?
            // 这里的逻辑就是有一个就可以了
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                if (authority.getAuthority().equals(needRole)){
                    return;
                }
            }
        }
        throw  new AccessDeniedException("权限不足，请联系管理员!");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
