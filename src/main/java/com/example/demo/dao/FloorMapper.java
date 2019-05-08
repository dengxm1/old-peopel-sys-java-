package com.example.demo.dao;


import com.example.demo.domain.Floor;
import com.example.demo.domain.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FloorMapper {
 public List<Floor> selectBypage(Page page);
 public int floorCount(Page page);
 public int addFloor(Floor floor);
 public int updateFloor(Floor floor);
 public int deleteFloor(int id);
}
