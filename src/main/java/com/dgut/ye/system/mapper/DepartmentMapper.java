package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Department;

/**
 * The interface Department mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface DepartmentMapper {
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
    int insert(Department record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Department record);

    /**
     * Select by primary key department.
     *
     * @param id the id
     * @return the department
     */
    Department selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Department record);
}
