package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Appraise;

/**
 * The interface Appraise mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface AppraiseMapper {
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
    int insert(Appraise record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Appraise record);

    /**
     * Select by primary key appraise.
     *
     * @param id the id
     * @return the appraise
     */
    Appraise selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Appraise record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Appraise record);
}
