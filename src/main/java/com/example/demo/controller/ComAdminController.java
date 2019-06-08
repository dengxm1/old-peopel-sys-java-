package com.example.demo.controller;

import com.example.demo.domain.ComAdmin;
import com.example.demo.service.ComAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ComAdmin")
public class ComAdminController {
  @Autowired
  private ComAdminService comAdminService;
  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public ComAdmin login(@RequestBody ComAdmin comAdmin){
    return comAdminService.login(comAdmin);
  }
}
