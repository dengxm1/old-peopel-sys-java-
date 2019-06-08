package com.example.demo.service.impl;

import com.example.demo.dao.ComAdminMapper;
import com.example.demo.domain.ComAdmin;
import com.example.demo.service.ComAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComAdminServiceImpl implements ComAdminService {
  @Autowired
  private ComAdminMapper comAdminMapper;
  @Override
  public ComAdmin login(ComAdmin comAdmin) {
    return comAdminMapper.login(comAdmin);
  }
}
