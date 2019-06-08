package com.example.demo.controller;

import com.example.demo.domain.Volunteer;
import com.example.demo.domain.VolunteerPage;
import com.example.demo.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {

  @Autowired
  private VolunteerService volunteerService;

  @RequestMapping(value = "getVolunteer",method = RequestMethod.POST)
  public Map<String,Object> getNursing(@RequestBody VolunteerPage page){
    Map<String,Object> map=new HashMap<String, Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(4);
    }
    page.calculateStart();
    List<Volunteer> volunteers=volunteerService.getVolunteer(page);
    int count=getCount(page);
    map.put("rows",volunteers);
    map.put("total",count);
    return map;
  }


  public int getCount(VolunteerPage page){
    return volunteerService.getCount(page);
  }


  @RequestMapping(value = "/add",method = RequestMethod.POST)
  public void add(@RequestBody Volunteer volunteer){
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    if(volunteer.getService_time()!=null){
      try {
        Date data=f.parse(f.format(volunteer.getService_time()));
        volunteer.setService_time(data);
      } catch(ParseException px) {
        px.printStackTrace();
      }
    }
    volunteerService.add(volunteer);
  }


  @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable("id") int id){
    volunteerService.delete(id);
  }


  @RequestMapping(value = "/update",method = RequestMethod.PUT)
  public void update(@RequestBody Volunteer volunteer){
    volunteerService.update(volunteer);
  }


}
