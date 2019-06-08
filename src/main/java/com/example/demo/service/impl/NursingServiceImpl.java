package com.example.demo.service.impl;

import com.example.demo.dao.NursingMapper;
import com.example.demo.domain.Nursing;
import com.example.demo.domain.NursingPage;
import com.example.demo.service.NursinigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingServiceImpl implements NursinigService {
  @Autowired
  private NursingMapper nursingMapper;
  @Override
  public List<Nursing> getNursing(NursingPage page) {
    return nursingMapper.getNursing(page);
  }

  @Override
  public int add(Nursing nursing) {
    return nursingMapper.add(nursing);
  }

  @Override
  public int delete(int id) {
    return nursingMapper.delete(id);
  }

  @Override
  public int update(Nursing nursing) {
    return nursingMapper.update(nursing);
  }

  @Override
  public int getCount(NursingPage page) {
    return nursingMapper.getCount(page);
  }
}
