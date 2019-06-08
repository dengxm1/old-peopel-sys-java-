package com.example.demo.controller;

import com.example.demo.domain.Hospital;
import com.example.demo.domain.HospitalPage;
import com.example.demo.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

  @Autowired
  private HospitalService hospitalService;

  @RequestMapping(value = "/getHospital",method = RequestMethod.POST)
  public Map<String,Object> getHospital(@RequestBody HospitalPage page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    if("true".equals(page.getLevel())) {
      page.setLevel("三级甲等");
    }
    int size=page.getSize();
    if(size==0){
      page.setSize(6);
    }
    page.calculateStart();
   List<Hospital> hospitals=hospitalService.getHospital(page);
    int count=getCount(page);
    map.put("rows",hospitals);
    map.put("total",count);
    return map;
  }


  public int getCount(HospitalPage page){
    return hospitalService.getCount(page);
  }


  @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable("id")int id){
     hospitalService.delete(id);
  }


  @RequestMapping(value = "/add",method = RequestMethod.POST)
  public void add(@RequestBody Hospital hospital){
    hospitalService.add(hospital);
  }


  @RequestMapping(value = "/update",method = RequestMethod.PUT)
  public void update(@RequestBody Hospital hospital){
    hospitalService.update(hospital);
  }


}
