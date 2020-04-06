package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Menu {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    /**
     *   meta 就是keepalive 和 requireAuth
     * */
    private Meta meta;

    private Integer parentId;

    private Boolean enabled;

    /**
    *   子菜单
     * */
    private List<Menu> children;

}
