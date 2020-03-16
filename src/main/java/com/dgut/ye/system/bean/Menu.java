package com.dgut.ye.system.bean;

import lombok.Data;

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

    private String iconcls;

    private Boolean keepalive;

    private Boolean requireauth;

    private Integer parentid;

    private Boolean enabled;

}
