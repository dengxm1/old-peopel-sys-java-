package com.example.demo.service.impl;

import com.example.demo.dao.CpeopleMapper;
import com.example.demo.domain.Cpeople;
import com.example.demo.service.CpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpeopleServiceImpl implements CpeopleService {
  @Autowired
  private CpeopleMapper cpeopleMapper;
  @Override
  public Cpeople login(Cpeople cpeople) {
    return cpeopleMapper.login(cpeople);
  }

  @Override
  public Cpeople verify(String name) {
    return cpeopleMapper.verify(name);
  }

  @Override
  public int register(Cpeople cpeople) {
    return cpeopleMapper.register(cpeople);
  }
}
