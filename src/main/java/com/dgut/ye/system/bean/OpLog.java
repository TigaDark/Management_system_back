package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class OpLog {
    private Integer id;

    private Date adddate;

    private String operate;

    private Integer hrid;

}
