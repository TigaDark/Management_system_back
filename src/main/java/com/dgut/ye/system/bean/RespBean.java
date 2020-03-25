package com.dgut.ye.system.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author : DGUT.YE
 * @date : 2020/03/24
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private Integer status;
    private String msg;
    private Object object;

    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }
    public static RespBean ok(String msg,Object o){
        return new RespBean(200,msg,o);
    }

    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }
    public static RespBean error(String msg,Object o){
        return new RespBean(500,msg,o);
    }


}
