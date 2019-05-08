package com.example.demo.service;

import com.example.demo.domain.Oldpeople;
import com.example.demo.domain.OldpeoplePage;

import java.util.List;

public interface OldpeopleService {
  public List<Oldpeople> selectBypage(OldpeoplePage page);
  public int add(Oldpeople oldpeople);
  public int delete(int id);
  public int update(Oldpeople oldpeople);
  public int getCount(OldpeoplePage page);
}
