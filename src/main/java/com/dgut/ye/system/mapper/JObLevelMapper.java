package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.JObLevel;

/**
 * The interface J ob level mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface JObLevelMapper {
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
    int insert(JObLevel record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(JObLevel record);

    /**
     * Select by primary key j ob level.
     *
     * @param id the id
     * @return the j ob level
     */
    JObLevel selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(JObLevel record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(JObLevel record);
}
