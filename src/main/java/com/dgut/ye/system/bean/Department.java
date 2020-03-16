package com.dgut.ye.system.bean;

import lombok.Data;

/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Department {
    private Integer id;

    private String name;

    private Integer parentid;

    private String deppath;

    private Boolean enabled;

    private Boolean isparent;

}
