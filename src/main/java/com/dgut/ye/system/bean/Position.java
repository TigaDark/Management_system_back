package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Position {
    private Integer id;

    private String name;

    private Date createdate;

    private Boolean enabled;

}
