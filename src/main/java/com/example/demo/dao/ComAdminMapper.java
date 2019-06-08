package com.example.demo.dao;

import com.example.demo.domain.ComAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ComAdminMapper {
  public ComAdmin login(ComAdmin comAdmin);
}
