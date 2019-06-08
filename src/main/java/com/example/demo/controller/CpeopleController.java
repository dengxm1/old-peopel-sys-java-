package com.example.demo.controller;

import com.example.demo.domain.Cpeople;
import com.example.demo.service.CpeopleService;
import com.example.demo.service.impl.CpeopleServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cpeople")
public class CpeopleController {

  @Autowired
  private CpeopleService cpeopleService;

  @RequestMapping(value = "/register",method = RequestMethod.POST)
  public Map<String,Object> register(@RequestBody Cpeople cpeople){
    Map<String,Object> map=new HashMap<String, Object>();
     if(verify(cpeople.getName())!=null){
         map.put("message","用户名已存在");
         return map;
     }
    int a=cpeopleService.register(cpeople);
    if (a > 0) {
     map.put("message","注册成功");
    }
  return map;
  }
  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public Map<String,Object> login(@RequestBody Cpeople cpeople){
    Map<String,Object> map=new HashMap<String, Object>();
    if(verify(cpeople.getName())==null){
      map.put("message","用户名不存在");
      return map;
    }
    Cpeople cpeople1 =cpeopleService.login(cpeople);
    map.put("cpeople",cpeople);
    return map;
  }
  public Cpeople verify(@Param("name") String name){
   return cpeopleService.verify(name);
  }


}
