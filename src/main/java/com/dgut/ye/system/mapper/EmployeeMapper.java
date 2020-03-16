package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Employee;

/**
 * The interface Employee mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface EmployeeMapper {
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
    int insert(Employee record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Employee record);

    /**
     * Select by primary key employee.
     *
     * @param id the id
     * @return the employee
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Employee record);
}
