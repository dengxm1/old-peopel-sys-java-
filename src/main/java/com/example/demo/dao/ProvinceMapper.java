package com.example.demo.dao;

import com.example.demo.domain.Province;
import com.example.demo.domain.ProvincePage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProvinceMapper {
  public List<Province> provinceInfo(ProvincePage provincePage);
  public int getCount();
}
