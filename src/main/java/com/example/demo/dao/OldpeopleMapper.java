package com.example.demo.dao;

import com.example.demo.domain.Oldpeople;
import com.example.demo.domain.OldpeoplePage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OldpeopleMapper {
  public List<Oldpeople> getOldpeople(OldpeoplePage oldpeoplePage);
  public int add(Oldpeople oldpeople);
  public int delete(int id);
  public int update(Oldpeople oldpeople);
  public int getCount(OldpeoplePage oldpeoplePage);

}
