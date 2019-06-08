package com.example.demo.service.impl;

import com.example.demo.dao.HospitalMapper;
import com.example.demo.domain.Hospital;
import com.example.demo.domain.HospitalPage;
import com.example.demo.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HospitalSericeImpl implements HospitalService {
  @Autowired
  private HospitalMapper hospitalMapper;
  @Override
  public List<Hospital> getHospital(HospitalPage page) {
    return hospitalMapper.getHospital(page);
  }

  @Override
  public int delete(int id) {
    return hospitalMapper.delete(id);
  }

  @Override
  public int update(Hospital hospital) {
    return hospitalMapper.update(hospital);
  }

  @Override
  public int add(Hospital hospital) {
    return hospitalMapper.add(hospital);
  }

  @Override
  public int getCount(HospitalPage page) {
    return hospitalMapper.getCount(page);
  }
}
