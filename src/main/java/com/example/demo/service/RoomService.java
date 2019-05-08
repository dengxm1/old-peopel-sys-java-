package com.example.demo.service;

import com.example.demo.domain.Room;
import com.example.demo.domain.RoomPage;

import java.util.List;

public interface RoomService {
  public List<Room> selectBypage(RoomPage page);
  public int roomCount(RoomPage page);
  public int updateRoom(Room room);
  public int deleteRoom(int id);
  public int addRoom(Room room);

}
