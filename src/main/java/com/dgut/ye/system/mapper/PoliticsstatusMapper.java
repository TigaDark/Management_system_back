package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Politicsstatus;

/**
 * The interface Politicsstatus mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface PoliticsstatusMapper {
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
    int insert(Politicsstatus record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Politicsstatus record);

    /**
     * Select by primary key politicsstatus.
     *
     * @param id the id
     * @return the politicsstatus
     */
    Politicsstatus selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Politicsstatus record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Politicsstatus record);
}
