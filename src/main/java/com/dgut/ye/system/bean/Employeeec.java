package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Employeeec {
    private Integer id;

    private Integer eid;

    private Date ecdate;

    private String ecreason;

    private Integer ecpoint;

    private Integer ectype;

    private String remark;

}
