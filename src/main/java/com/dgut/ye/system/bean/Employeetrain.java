package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Employeetrain {
    private Integer id;

    private Integer eid;

    private Date traindate;

    private String traincontent;

    private String remark;

}
