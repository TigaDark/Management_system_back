package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Employeeec;

/**
 * The interface Employeeec mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface EmployeeecMapper {
    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Employeeec record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Employeeec record);

    /**
     * Select by primary key employeeec.
     *
     * @param id the id
     * @return the employeeec
     */
    Employeeec selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Employeeec record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Employeeec record);
}
