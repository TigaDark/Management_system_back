package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.SysMsg;

/**
 * The interface Sys msg mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface SysMsgMapper {
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
    int insert(SysMsg record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(SysMsg record);

    /**
     * Select by primary key sys msg.
     *
     * @param id the id
     * @return the sys msg
     */
    SysMsg selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(SysMsg record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(SysMsg record);
}
