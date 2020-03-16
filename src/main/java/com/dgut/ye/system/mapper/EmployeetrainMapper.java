package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Employeetrain;

/**
 * The interface Employeetrain mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface EmployeetrainMapper {
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
    int insert(Employeetrain record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Employeetrain record);

    /**
     * Select by primary key employeetrain.
     *
     * @param id the id
     * @return the employeetrain
     */
    Employeetrain selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Employeetrain record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Employeetrain record);
}
