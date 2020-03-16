package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.HrRole;

/**
 * The interface Hr role mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface HrRoleMapper {
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
    int insert(HrRole record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(HrRole record);

    /**
     * Select by primary key hr role.
     *
     * @param id the id
     * @return the hr role
     */
    HrRole selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(HrRole record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(HrRole record);
}
