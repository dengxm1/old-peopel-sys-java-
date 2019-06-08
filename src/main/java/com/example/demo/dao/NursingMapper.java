package com.example.demo.dao;

import com.example.demo.domain.Nursing;
import com.example.demo.domain.NursingPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface NursingMapper {
  public List<Nursing> getNursing(NursingPage page);
  public int add(Nursing nursing);
  public int delete(int id);
  public int update(Nursing nursing);
  public int getCount(NursingPage page);
}
