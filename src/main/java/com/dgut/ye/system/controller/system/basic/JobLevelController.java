package com.dgut.ye.system.controller.system.basic;

import com.dgut.ye.system.bean.JobLevel;
import com.dgut.ye.system.bean.RespBean;
import com.dgut.ye.system.service.system.JobLevelService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/06/24
 **/
@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    JobLevelService jobLevelService;

    @GetMapping("/")
    public List<JobLevel> getAllJobLevles(){
        return jobLevelService.getAllJobLevels();
    }

    @PostMapping("/")
    public RespBean addJobLevel(@RequestBody JobLevel jobLevel){
        if (jobLevelService.addJobLevel(jobLevel)==1){
            return RespBean.ok("添加职称成功!");
        }
        return RespBean.error("添加职称失败！");
    }

    @PutMapping("/")
    public RespBean updataJobLevel(@RequestBody JobLevel jobLevel){
        if (jobLevelService.updataJobLevel(jobLevel)==1){
            return RespBean.ok("修改职称成功!");
        }
        return RespBean.error("修改职称失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleJobLevel(@PathVariable("id") Integer id){
        if (jobLevelService.deleJobLevel(id)==1){
            return RespBean.ok("删除职称成功!");
        }
        return RespBean.error("删除职称失败！");
    }


    @DeleteMapping("/")
    public RespBean delePosition(Integer[] ids){
        if (jobLevelService.delePositionByIds(ids)==ids.length){
            return RespBean.ok("批量删除职称成功!");
        }
        return RespBean.error("批量删除职称失败!");
    }
}
