package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Appraise {
    private Integer id;

    private Integer eid;

    private Date appdate;

    private String appresult;

    private String appcontent;

    private String remark;

}
