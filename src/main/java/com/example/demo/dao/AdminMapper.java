package com.example.demo.dao;

import com.example.demo.domain.Admin;
import com.example.demo.domain.PassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper {
  public Admin adminInfo(Admin admin);
  public Admin selectPass(@Param("oldPass") String oldPass);
  public int changePassword(PassInfo password);
}
