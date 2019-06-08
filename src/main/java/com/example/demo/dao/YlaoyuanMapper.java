package com.example.demo.dao;

import com.example.demo.domain.Ylaoyuan;
import com.example.demo.domain.YlaoyuanPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YlaoyuanMapper {
  public List<Ylaoyuan> getYlaoyuan(YlaoyuanPage page);
  public int getCount(YlaoyuanPage page);
  public int addInfo(Ylaoyuan ylaoyuan);
  public int deleteInfo(int id);
  public int updateInfo(Ylaoyuan ylaoyuan);
}
