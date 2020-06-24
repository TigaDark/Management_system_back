package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.JobLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface J ob level mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface JobLevelMapper {
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
    int insert(JobLevel record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(JobLevel record);

    /**
     * Select by primary key j ob level.
     *
     * @param id the id
     * @return the j ob level
     */
    JobLevel selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(JobLevel record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(JobLevel record);

    List<JobLevel> getAllJoblLevels();

    int deleteJobLeveByIds(@Param("ids")Integer[] ids);
}
