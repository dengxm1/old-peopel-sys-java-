package com.example.demo.service.impl;

import com.example.demo.dao.OldpeopleMapper;
import com.example.demo.domain.Oldpeople;
import com.example.demo.domain.OldpeoplePage;
import com.example.demo.service.OldpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OldpeopleServiceImpl implements OldpeopleService {
  @Autowired
  private OldpeopleMapper oldpeopleMapper;
  @Override
  public List<Oldpeople> selectBypage(OldpeoplePage page) {
    return oldpeopleMapper.selectBypage(page);
  }

  @Override
  public int add(Oldpeople oldpeople) {
    return oldpeopleMapper.add(oldpeople);
  }

  @Override
  public int delete(int id) {
    return oldpeopleMapper.delete(id);
  }

  @Override
  public int update(Oldpeople oldpeople) {
    return oldpeopleMapper.update(oldpeople);
  }

  @Override
  public int getCount(OldpeoplePage page) {
    return oldpeopleMapper.getCount(page);
  }
}
