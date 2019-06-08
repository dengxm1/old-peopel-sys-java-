package com.example.demo.service;

import com.example.demo.domain.Nursing;
import com.example.demo.domain.NursingPage;

import java.util.List;

public interface NursinigService {
  public List<Nursing> getNursing(NursingPage page);
  public int add(Nursing nursing);
  public int delete(int id);
  public int update(Nursing nursing);
  public int getCount(NursingPage page);
}
