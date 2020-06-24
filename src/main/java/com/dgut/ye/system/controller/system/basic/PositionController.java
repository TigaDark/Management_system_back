package com.dgut.ye.system.controller.system.basic;

import com.dgut.ye.system.bean.Position;
import com.dgut.ye.system.bean.RespBean;
import com.dgut.ye.system.service.system.PositionService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : DGUT.YE
 * @date : 2020/04/30
 **/
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {

    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPosition(){
        return positionService.getAllPositons();
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        if (positionService.addPosition(position)==1){
            return RespBean.ok("添加职位成功!");
        }
        return RespBean.error("添加职位失败!");
    }

    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if (positionService.updatePosition(position)==1){
            return RespBean.ok("修改职位成功!");
        }
        return RespBean.error("修改职位失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean delePosition(@PathVariable Integer id){
        if (positionService.delePositionById(id)==1){
            return RespBean.ok("删除职位成功!");
        }
        return RespBean.error("删除职位失败!");
    }

    @DeleteMapping("/")
    public RespBean delePosition(Integer[] ids){
        if (positionService.delePositionByIds(ids)==ids.length){
            return RespBean.ok("批量删除职位成功!");
        }
        return RespBean.error("批量删除职位失败!");
    }

}
