package com.dgut.ye.system.service.system;

import com.dgut.ye.system.bean.JobLevel;
import com.dgut.ye.system.mapper.JobLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/06/24
 **/
@Service
public class JobLevelService {
    @Autowired
    JobLevelMapper jobLevelMapper;


    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJoblLevels();
    }

    public int addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreateDate(new Date());
        jobLevel.setEnabled(true);
        return jobLevelMapper.insert(jobLevel);
    }

    public int updataJobLevel(JobLevel jobLevel) {
        return jobLevelMapper.updateByPrimaryKeySelective(jobLevel);
    }

    public int deleJobLevel(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    public int delePositionByIds(Integer[] ids) {
        return jobLevelMapper.deleteJobLeveByIds(ids);
    }
}
