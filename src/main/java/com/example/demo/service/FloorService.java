package com.example.demo.service;

import com.example.demo.domain.Floor;
import com.example.demo.domain.Page;

import java.util.List;

public interface FloorService {
  public List<Floor> selectBypage(Page page);
  public int floorCount(Page page);
  public int addFloor(Floor floor);
  public int updateFloor(Floor floor);
  public int deleteFloor(int id);
}
