package com.example.demo.service;

import com.example.demo.domain.Admin;
import com.example.demo.domain.PassInfo;


public interface AdminService {
  public Admin adminInfo(Admin admin);
  public Admin selectPass(String oldPass);
  public int changePassword(PassInfo password);
}
