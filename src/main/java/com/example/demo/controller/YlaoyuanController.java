package com.example.demo.controller;

import com.example.demo.domain.Ylaoyuan;
import com.example.demo.domain.YlaoyuanPage;
import com.example.demo.service.YlaoyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ylaoyuan")
public class YlaoyuanController {

  @Autowired
  private YlaoyuanService ylaoyuanService;

  @RequestMapping(value = "/getYlaoyuan",method = RequestMethod.POST)
  public Map<String,Object> getYlaoyuan(@RequestBody YlaoyuanPage page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    String bed_range=page.getBed_range();
    String price=page.getPrice();
    if(bed_range!=null&&bed_range!=""){
      if(bed_range.endsWith("内")){
      String top_bed= bed_range.substring(0,bed_range.length()-2);
      page.setTop_bed(Integer.parseInt(top_bed));
      }else if(bed_range.endsWith("上")){
       String low_bed=bed_range.substring(0,bed_range.length()-2);
       page.setLow_bed(Integer.parseInt(low_bed));
      }else{
        String bed_number[]=bed_range.split("-");
        page.setLow_bed(Integer.parseInt(bed_number[0]));
        page.setTop_bed(Integer.parseInt(bed_number[1]));
     }
    }
    if(price!=""&&price!=null){
      if(price.endsWith("下")){
        String top_price=price.substring(0,price.length()-2);
        page.setTop_price(Integer.parseInt(top_price));
      }else if(price.endsWith("上")){
        String bottom_price=price.substring(0,price.length()-2);
        page.setBottom_price(Integer.parseInt(bottom_price));
      }else{
        String price_range[]=price.split("-");
        for(String p:price_range){
          System.out.println(p);
        }
        page.setBottom_price(Integer.parseInt(price_range[0]));
        page.setTop_price(Integer.parseInt(price_range[1]));
      }
    }
    int size=page.getSize();
    if(size==0){
      page.setSize(5);
    }
    page.calculateStart();
   List<Ylaoyuan> ylaoyuans=ylaoyuanService.getYlaoyuan(page);
    int count=getCount(page);
    map.put("rows",ylaoyuans);
    map.put("total",count);
    return map;
  }


  public int getCount(YlaoyuanPage page){
    return ylaoyuanService.getCount(page);
  }


  @RequestMapping(value = "add",method = RequestMethod.POST)
  public void add(@RequestBody Ylaoyuan ylaoyuan){
    ylaoyuanService.addInfo(ylaoyuan);
  }


  @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable("id") int id){
    ylaoyuanService.deleteInfo(id);
  }


  @RequestMapping(value = "/update",method = RequestMethod.PUT)
  public void update(@RequestBody Ylaoyuan ylaoyuan){
    ylaoyuanService.updateInfo(ylaoyuan);
  }


}
