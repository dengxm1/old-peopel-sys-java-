package com.example.demo.dao;

import com.example.demo.domain.Volunteer;
import com.example.demo.domain.VolunteerPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface VolunteerMapper {
  public List<Volunteer> getVolunteer(VolunteerPage page);
  public int add(Volunteer volunteer);
  public int delete(int id);
  public int update(Volunteer volunteer);
  public int getCount(VolunteerPage page);
}
