package com.example.demo.service.impl;

import com.example.demo.dao.ProvinceMapper;
import com.example.demo.domain.Province;
import com.example.demo.domain.ProvincePage;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImple implements ProvinceService {
  @Autowired
  private ProvinceMapper provinceMapper;
  @Override
  public List<Province> provinceInfo(ProvincePage provincePage) {
    return provinceMapper.provinceInfo(provincePage);
  }

  @Override
  public int getCount() {
    return provinceMapper.getCount();
  }
}
