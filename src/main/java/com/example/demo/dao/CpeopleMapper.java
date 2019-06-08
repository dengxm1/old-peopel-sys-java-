package com.example.demo.dao;

import com.example.demo.domain.Cpeople;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface CpeopleMapper {
  public Cpeople login(Cpeople cpeople);
  public Cpeople verify(String name);
  public int register(Cpeople cpeople);
}
