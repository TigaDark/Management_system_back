package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Employeeremove {
    private Integer id;

    private Integer eid;

    private Integer afterdepid;

    private Integer afterjobid;

    private Date removedate;

    private String reason;

    private String remark;


}
