package com.example.demo.service.impl;

import com.example.demo.dao.YlaoyuanMapper;
import com.example.demo.domain.Ylaoyuan;
import com.example.demo.domain.YlaoyuanPage;
import com.example.demo.service.YlaoyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YlaoyuanServiceImple implements YlaoyuanService {
  @Autowired
  private YlaoyuanMapper ylaoyuanMapper;
  @Override
  public List<Ylaoyuan> getYlaoyuan(YlaoyuanPage page) {
    return ylaoyuanMapper.getYlaoyuan(page);
  }

  @Override
  public int getCount(YlaoyuanPage page) {
    return ylaoyuanMapper.getCount(page);
  }

  @Override
  public int addInfo(Ylaoyuan ylaoyuan) {
    return ylaoyuanMapper.addInfo(ylaoyuan);
  }

  @Override
  public int deleteInfo(int id) {
    return ylaoyuanMapper.deleteInfo(id);
  }

  @Override
  public int updateInfo(Ylaoyuan ylaoyuan) {
    return ylaoyuanMapper.updateInfo(ylaoyuan);
  }
}
