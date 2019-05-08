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
@RequestMapping("oldpeple")
@CrossOrigin
public class OldpeopleController {

  @Autowired
  private OldpeopleService oldpeopleService;

  @RequestMapping(value = "getPeople",method = RequestMethod.POST)
  public Map<String,Object> selectBypage(@RequestBody OldpeoplePage page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
    page.calculateStart();
    System.out.println(page.getStart());
    List<Oldpeople> oldpeople=oldpeopleService.selectBypage(page);
    int count=getCount(page);
    map.put("rows",oldpeople);
    map.put("total",count);
    return map;
  }


  public int getCount(OldpeoplePage page){
    return oldpeopleService.getCount(page);
  }


  @RequestMapping(value = "add",method = RequestMethod.POST)
  public void add(@RequestBody Oldpeople oldpeople){
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    if(oldpeople.getRegister_time()!=null){
      try {
        Date data=f.parse(f.format(oldpeople.getRegister_time()));
        oldpeople.setRegister_time(data);
      } catch(ParseException px) {
        px.printStackTrace();
      }
    }

    oldpeopleService.add(oldpeople);
  }


  @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable("id")int id){
    oldpeopleService.delete(id);
  }


  @RequestMapping(value = "update",method = RequestMethod.PUT)
  public void update(@RequestBody Oldpeople oldpeople){
    oldpeopleService.update(oldpeople);
  }


}
