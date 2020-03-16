package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Employeeremove;

/**
 * The interface Employeeremove mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface EmployeeremoveMapper {
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
    int insert(Employeeremove record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Employeeremove record);

    /**
     * Select by primary key employeeremove.
     *
     * @param id the id
     * @return the employeeremove
     */
    Employeeremove selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Employeeremove record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Employeeremove record);
}
