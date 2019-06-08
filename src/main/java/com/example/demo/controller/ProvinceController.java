package com.example.demo.controller;

import com.example.demo.domain.Province;
import com.example.demo.domain.ProvincePage;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/province")
public class ProvinceController {
  @Autowired
  private ProvinceService provinceService;
  @RequestMapping(value = "/getProvince",method = RequestMethod.POST)
  public Map<String,Object> provinceInfo(@RequestBody ProvincePage page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
    page.calculateStart();
    List<Province> provinces=provinceService.provinceInfo(page);
    int count=getCount();
    map.put("rows",provinces);
    map.put("total",count);
    return map;

  }
  public int getCount(){
    return provinceService.getCount();
  }

}
