package com.dgut.ye.system.service;

import com.dgut.ye.system.bean.Hr;
import com.dgut.ye.system.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author : DGUT.YE
 * @date : 2020/03/24
 **/
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(name);
        if (hr == null){
            throw new UsernameNotFoundException("用户名不存在!");
        }
        return hr;
    }
}
