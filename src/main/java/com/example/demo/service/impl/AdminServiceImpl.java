package com.example.demo.service.impl;

import com.example.demo.dao.AdminMapper;
import com.example.demo.domain.Admin;
import com.example.demo.domain.PassInfo;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {
  @Autowired
  private AdminMapper adminMapper;
  @Override
  public Admin adminInfo(Admin admin) {
    return adminMapper.adminInfo(admin);
  }

  @Override
  public Admin selectPass(String oldPass) {
    return adminMapper.selectPass(oldPass);
  }

  @Override
  public int changePassword(PassInfo passInfo) {
   return adminMapper.changePassword(passInfo);
  }
}
