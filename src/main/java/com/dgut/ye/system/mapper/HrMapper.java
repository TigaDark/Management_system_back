package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Hr;

/**
 * The interface Hr mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface HrMapper {
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
    int insert(Hr record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Hr record);

    /**
     * Select by primary key hr.
     *
     * @param id the id
     * @return the hr
     */
    Hr selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Hr record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Hr record);

    /**
     * Load user by username hr.
     *
     * @param name the name
     * @return the hr
     */
    Hr loadUserByUsername(String name);
}
