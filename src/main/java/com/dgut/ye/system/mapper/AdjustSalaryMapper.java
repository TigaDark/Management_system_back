package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.AdjustSalary;

/**
 * The interface Adjust salary mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface AdjustSalaryMapper {
    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(AdjustSalary record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(AdjustSalary record);

    /**
     * Select by primary key adjust salary.
     *
     * @param id the id
     * @return the adjust salary
     */
    AdjustSalary selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(AdjustSalary record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(AdjustSalary record);
}
