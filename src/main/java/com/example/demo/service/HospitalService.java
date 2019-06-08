package com.example.demo.service;

import com.example.demo.domain.Hospital;
import com.example.demo.domain.HospitalPage;

import java.util.List;

public interface HospitalService {
  public List<Hospital> getHospital(HospitalPage page);
  public int delete(int id);
  public int update(Hospital hospital);
  public int add(Hospital hospital);
  public int getCount(HospitalPage page);
}
