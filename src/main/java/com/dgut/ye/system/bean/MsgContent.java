package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class MsgContent {
    private Integer id;

    private String title;

    private String message;

    private Date createdate;

}
