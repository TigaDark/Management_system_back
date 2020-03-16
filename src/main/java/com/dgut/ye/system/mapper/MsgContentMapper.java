package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.MsgContent;

/**
 * The interface Msg content mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface MsgContentMapper {
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
    int insert(MsgContent record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(MsgContent record);

    /**
     * Select by primary key msg content.
     *
     * @param id the id
     * @return the msg content
     */
    MsgContent selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(MsgContent record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(MsgContent record);
}
