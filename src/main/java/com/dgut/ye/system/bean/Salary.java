package com.dgut.ye.system.bean;

import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class Salary {
    private Integer id;

    private Integer basicsalary;

    private Integer bonus;

    private Integer lunchsalary;

    private Integer trafficsalary;

    private Integer allsalary;

    private Integer pensionbase;

    private Float pensionper;

    private Date createdate;

    private Integer medicalbase;

    private Float medicalper;

    private Integer accumulationfundbase;

    private Float accumulationfundper;

    private String name;

}
