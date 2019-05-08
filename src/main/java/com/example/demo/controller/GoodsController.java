package com.example.demo.controller;


import com.example.demo.domain.Goods;
import com.example.demo.domain.GoodsPage;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {

  @Autowired
  private GoodsService goodsService;
  @RequestMapping(value = "getGoods",method = RequestMethod.POST)
  public Map<String,Object> selectBypage(@RequestBody GoodsPage page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
    page.calculateStart();
    List<Goods> goods=goodsService.selectBypage(page);
    int count=getCount(page);
    map.put("rows",goods);
    map.put("total",count);
    return map;
  }
  public int getCount(GoodsPage page){
    return goodsService.getCount(page);
  }
  @RequestMapping(value = "/addGoods",method = RequestMethod.POST)
  public void addGoods(@RequestBody Goods goods){
    goodsService.addGoods(goods);
  }
  @RequestMapping(value = "deleteGoods/{id}",method = RequestMethod.DELETE)
  public void deleteGoods(@PathVariable("id")int id){
    goodsService.deleteGoods(id);
  }
  @RequestMapping(value = "updateGoods",method =RequestMethod.PUT )
  public void updateGoods(@RequestBody Goods goods){
    goodsService.updateGoods(goods);
  }
}
