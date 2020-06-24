package com.dgut.ye.system.exception;

import com.dgut.ye.system.bean.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author : DGUT.YE
 * @date : 2020/06/08
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public RespBean sqlException(SQLException e){
        if (e instanceof SQLIntegrityConstraintViolationException){
            return RespBean.error("该数据与其他数据有关联,操作失败！");
        } else {
            return RespBean.error("未知异常错误！");
        }
    }
}
