package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Position;

/**
 * The interface Position mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface PositionMapper {
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
    int insert(Position record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Position record);

    /**
     * Select by primary key position.
     *
     * @param id the id
     * @return the position
     */
    Position selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Position record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Position record);
}
