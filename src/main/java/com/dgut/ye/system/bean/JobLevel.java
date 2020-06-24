package com.dgut.ye.system.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
/**
 * @author : DGUT.YE
 * @date : 2020/03/15
 **/
@Data
public class JobLevel {
    private Integer id;

    private String name;

    private String titleLevel;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date createDate;

    private Boolean enabled;

}
