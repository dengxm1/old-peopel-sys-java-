package com.example.demo.dao;

import com.example.demo.domain.Hospital;
import com.example.demo.domain.HospitalPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface HospitalMapper {
  public List<Hospital> getHospital(HospitalPage page);
  public int delete(int id);
  public int update(Hospital hospital);
  public int add(Hospital hospital);
  public int getCount(HospitalPage page);
}
