package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Nation;

/**
 * The interface Nation mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface NationMapper {
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
    int insert(Nation record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Nation record);

    /**
     * Select by primary key nation.
     *
     * @param id the id
     * @return the nation
     */
    Nation selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Nation record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Nation record);
}
