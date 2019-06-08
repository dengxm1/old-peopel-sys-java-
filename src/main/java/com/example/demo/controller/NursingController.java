package com.example.demo.controller;

import com.example.demo.domain.Nursing;
import com.example.demo.domain.NursingPage;
import com.example.demo.service.NursinigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/nursing")
public class NursingController {

  @Autowired
  private NursinigService nursinigService;

  @RequestMapping(value = "getNursing",method = RequestMethod.POST)
  public Map<String,Object> getNursing(@RequestBody NursingPage page){
    Map<String,Object> map=new HashMap<String, Object>();
    String age=page.getAge();
    String hope_salary=page.getHope_salary();
    if(age!=null&&age!=""){
      if(age.endsWith("下")){
        String low_age= age.substring(0,age.length()-3);
        page.setLow_age(Integer.parseInt(low_age));
      }else if(age.endsWith("上")){
        String top_age=age.substring(0,age.length()-3);
        page.setTop_age(Integer.parseInt(top_age));
      }else{
        String age_range=age.substring(0,age.length()-1);
        String age_arr[]=age_range.split("~");
        page.setLow_age(Integer.parseInt(age_arr[0]));
        page.setTop_age(Integer.parseInt(age_arr[1]));
      }
    }
    if(hope_salary!=null&&hope_salary!=""){
      if(hope_salary.endsWith("上")){
        String low_salary=hope_salary.substring(0,hope_salary.length()-2);
        page.setLow_salary(Integer.parseInt(low_salary));
      }else{
        String salary_arr[]=hope_salary.split("~");
        page.setLow_salary(Integer.parseInt(salary_arr[0]));
        page.setTop_salary(Integer.parseInt(salary_arr[1]));
      }
    }
    int size=page.getSize();
    if(size==0){
      page.setSize(9);
    }
    page.calculateStart();
   List<Nursing> nursings=nursinigService.getNursing(page);
   int count=getCount(page);
   map.put("rows",nursings);
   map.put("total",count);
   return map;
  }


  public int getCount(NursingPage page){
    return nursinigService.getCount(page);
  }


  @RequestMapping(value = "/add",method = RequestMethod.POST)
  public void add(@RequestBody Nursing nursing){
    nursinigService.add(nursing);
  }


  @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable("id") int id){
    nursinigService.delete(id);
  }


  @RequestMapping(value = "/update",method = RequestMethod.PUT)
  public void update(@RequestBody Nursing nursing){
    nursinigService.update(nursing);
  }


}
