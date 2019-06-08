package com.example.demo.service;

import com.example.demo.domain.Province;
import com.example.demo.domain.ProvincePage;

import java.util.List;

public interface ProvinceService {
  public List<Province> provinceInfo(ProvincePage provincePage);
  public int getCount();
}
