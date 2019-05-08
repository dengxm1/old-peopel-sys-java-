package com.example.demo.service.impl;

import com.example.demo.dao.RoomMapper;
import com.example.demo.domain.Room;
import com.example.demo.domain.RoomPage;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

  @Autowired
  private RoomMapper roomMapper;
  @Override
  public List<Room> selectBypage(RoomPage page) {
    return roomMapper.selectBypage(page);
  }

  @Override
  public int roomCount(RoomPage page) {
    return roomMapper.roomCount(page);
  }

  @Override
  public int updateRoom(Room room) {
    return roomMapper.updateRoom(room);
  }

  @Override
  public int deleteRoom(int id) {
    return roomMapper.deleteRoom(id);
  }

  @Override
  public int addRoom(Room room) {
    return roomMapper.addRoom(room);
  }
}
