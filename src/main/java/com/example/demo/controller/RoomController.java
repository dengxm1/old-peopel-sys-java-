package com.example.demo.controller;

import com.example.demo.domain.Room;
import com.example.demo.domain.RoomPage;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("room")
@CrossOrigin
public class RoomController {

  @Autowired
  private RoomService roomService;

  @RequestMapping(value = "getRoom",method = RequestMethod.POST)
   public Map<String,Object> selectBypage(@RequestBody RoomPage page){
     Map<String,Object> map=new HashMap<String,Object>();
     int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
    page.calculateStart();
    List<Room> rooms=roomService.selectBypage(page);
    int count=getCount(page);
    map.put("rows",rooms);
    map.put("total",count);
    return map;
   }


  public int getCount(RoomPage page){
   return roomService.roomCount(page);
   }


  @RequestMapping(value = "updateRoom",method = RequestMethod.PUT)
   public void updateRoom(@RequestBody Room room){
     roomService.updateRoom(room);
   }


  @RequestMapping(value = "deleteRoom/{id}",method = RequestMethod.DELETE)
   public void deleteRoom(@PathVariable("id")int id){
    roomService.deleteRoom(id);
   }


  @RequestMapping(value = "addRoom",method = RequestMethod.POST)
    public void addRoom(@RequestBody Room room){
    roomService.addRoom(room);
   }


}
