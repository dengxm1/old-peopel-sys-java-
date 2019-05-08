package com.example.demo.controller;

import com.example.demo.domain.Page;
import com.example.demo.domain.Floor;
import com.example.demo.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/floor")
@CrossOrigin
public class FloorController {

  @Autowired
  private FloorService floorService;

  @RequestMapping(value = "getFloor",method = RequestMethod.POST)
  public Map<String ,Object> selectBypage(@RequestBody Page page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
     page.calculateStart();
    List<Floor> floors=floorService.selectBypage(page);
    int count=getCount(page);

    map.put("rows",floors);
    map.put("total",count);
    return map;
  }
  public int getCount(Page page){
   return floorService.floorCount(page);
  }
  @RequestMapping(value = "addFloor",method = RequestMethod.POST)
  public void addFloor(@RequestBody Floor floor){
     floorService.addFloor(floor);
  }

  @RequestMapping(value = "updateFloor",method = RequestMethod.PUT)
  public void updateFloor(@RequestBody Floor floor){
    floorService.updateFloor(floor);
  }

  @RequestMapping(value = "deleteFloor/{id}",method = RequestMethod.DELETE)
  public void deleteFloor(@PathVariable("id")int id){
    floorService.deleteFloor(id);
  }
}
