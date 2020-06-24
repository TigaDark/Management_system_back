package com.dgut.ye.system.service.system;

import com.dgut.ye.system.bean.Position;
import com.dgut.ye.system.mapper.PositionMapper;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PositionService{

    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPositons() {
        return positionMapper.getAllPositons();
    }

    public int addPosition(Position position) {
        position.setCreateDate(new Date());
        position.setEnabled(true);
        return positionMapper.insert(position);
    }

    public int updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public int delePositionById(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    public int delePositionByIds(Integer[] ids) {
        return positionMapper.delePositionByIds(ids);
    }
}
