package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Salary;

/**
 * The interface Salary mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface SalaryMapper {
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
    int insert(Salary record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Salary record);

    /**
     * Select by primary key salary.
     *
     * @param id the id
     * @return the salary
     */
    Salary selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Salary record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Salary record);
}
