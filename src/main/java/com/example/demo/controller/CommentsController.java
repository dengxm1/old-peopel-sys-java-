package com.example.demo.controller;

import com.example.demo.domain.Comments;
import com.example.demo.domain.CommentsPage;
import com.example.demo.service.CommentsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comments")
public class CommentsController {
@Autowired
  private CommentsService commentsService;
@RequestMapping(value = "/add",method = RequestMethod.POST)
public void add(@RequestBody Comments comments){
  commentsService.add(comments);
}
@RequestMapping(value = "/delete",method = RequestMethod.GET)
public void delete(@Param("cname") String cname){
  commentsService.delete(cname);
}
@RequestMapping(value = "/getComments",method = RequestMethod.POST)
public Map<String,Object> getComments(@RequestBody CommentsPage page){
  Map<String ,Object> map=new HashMap<String ,Object>();
  int size=page.getSize();
  if(size==0){
    page.setSize(10);
  }
  page.calculateStart();
 List<Comments> comments= commentsService.selectBypage(page);
 int count=getCount();
  map.put("rows",comments);
  map.put("total",count);
  return map;
}
public int getCount(){
  return commentsService.getCount();
}
}
