package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.OpLog;

/**
 * The interface Op log mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface OpLogMapper {
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
    int insert(OpLog record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(OpLog record);

    /**
     * Select by primary key op log.
     *
     * @param id the id
     * @return the op log
     */
    OpLog selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(OpLog record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(OpLog record);
}
