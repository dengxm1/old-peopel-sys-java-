package com.example.demo.dao;

import com.example.demo.domain.Room;
import com.example.demo.domain.RoomPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
  public List<Room> selectBypage(RoomPage page);
  public int roomCount(RoomPage page);
  public int updateRoom(Room room);
  public int deleteRoom(int id);
  public int addRoom(Room room);
}
