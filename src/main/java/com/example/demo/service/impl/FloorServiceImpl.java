package com.example.demo.service.impl;


import com.example.demo.dao.FloorMapper;
import com.example.demo.domain.Floor;
import com.example.demo.domain.Page;
import com.example.demo.service.FloorService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorServiceImpl implements FloorService {
  @Autowired
  private FloorMapper floorMapper;
  @Override
  public List<Floor> selectBypage(Page page) {
    return floorMapper.selectBypage(page);
  }

  @Override
  public int floorCount(Page page){
    return floorMapper.floorCount(page);
  }

  @Override
  public int addFloor(Floor floor) {
    return floorMapper.addFloor(floor);
  }

  @Override
  public int updateFloor(Floor floor) {
    return floorMapper.updateFloor(floor);
  }

  @Override
  public int deleteFloor(int id) {
    return floorMapper.deleteFloor(id);
  }
}
