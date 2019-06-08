package com.example.demo.service;

import com.example.demo.domain.Ylaoyuan;
import com.example.demo.domain.YlaoyuanPage;

import java.util.List;

public interface YlaoyuanService {
  public List<Ylaoyuan> getYlaoyuan(YlaoyuanPage page);
  public int getCount(YlaoyuanPage page);
  public int addInfo(Ylaoyuan ylaoyuan);
  public int deleteInfo(int id);
  public int updateInfo(Ylaoyuan ylaoyuan);
}
