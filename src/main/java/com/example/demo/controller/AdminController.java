package com.example.demo.controller;

import com.example.demo.domain.Admin;
import com.example.demo.domain.PassInfo;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  private AdminService adminService;

  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public Admin login(@RequestBody  Admin admin){
     return adminService.adminInfo(admin);
  }


  @RequestMapping(value = "/changePass",method = RequestMethod.PUT)
  public int changePassword(@RequestBody PassInfo passInfo) {
    if(selectPass(passInfo.getOldPass()) != null){
      return adminService.changePassword(passInfo);
    }
    return 0;
  }
  public Admin selectPass(String oldPass){
    return adminService.selectPass(oldPass);
  }

}
