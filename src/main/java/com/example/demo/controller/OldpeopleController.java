package com.example.demo.controller;

import com.example.demo.domain.Oldpeople;
import com.example.demo.domain.OldpeoplePage;
import com.example.demo.service.OldpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/oldpeople")
public class OldpeopleController {

  @Autowired
  private OldpeopleService oldpeopleService;

  @RequestMapping(value = "/getOldpeople",method = RequestMethod.POST)
  public Map<String,Object> getOldpeople(@RequestBody OldpeoplePage page){
    Map<String ,Object> map=new HashMap<String, Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
    page.calculateStart();
    List<Oldpeople> oldpeople=oldpeopleService.getOldpeople(page);
    int count=getCount(page);
    map.put("rows",oldpeople);
    map.put("total",count);
    return map;
  }


  public int getCount(OldpeoplePage page){
    return oldpeopleService.getCount(page);
}


  @RequestMapping(value = "/add",method = RequestMethod.POST)
public void add(@RequestBody Oldpeople oldpeople){
    oldpeopleService.add(oldpeople);
}


  @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
public void delete(@PathVariable("id") int id){
    oldpeopleService.delete(id);
}


  @RequestMapping(value = "/update",method = RequestMethod.POST)
public void update(@RequestBody Oldpeople oldpeople){
  SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
  if(oldpeople.getLastvisit_time()!=null){
    try {
      Date data=f.parse(f.format(oldpeople.getLastvisit_time()));
      System.out.println(data);
      oldpeople.setLastvisit_time(data);
      System.out.println(oldpeople.getLastvisit_time());
    } catch(ParseException px) {
      px.printStackTrace();
    }
  }
    oldpeopleService.update(oldpeople);
}


}
