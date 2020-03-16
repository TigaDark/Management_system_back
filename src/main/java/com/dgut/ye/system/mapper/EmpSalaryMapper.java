package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.EmpSalary;

/**
 * The interface Emp salary mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface EmpSalaryMapper {
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
    int insert(EmpSalary record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(EmpSalary record);

    /**
     * Select by primary key emp salary.
     *
     * @param id the id
     * @return the emp salary
     */
    EmpSalary selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(EmpSalary record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(EmpSalary record);
}
