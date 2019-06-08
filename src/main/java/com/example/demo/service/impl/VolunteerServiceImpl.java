package com.example.demo.service.impl;

import com.example.demo.dao.VolunteerMapper;
import com.example.demo.domain.Volunteer;
import com.example.demo.domain.VolunteerPage;
import com.example.demo.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService {
  @Autowired
  private VolunteerMapper volunteerMapper;
  @Override
  public List<Volunteer> getVolunteer(VolunteerPage page) {
    return volunteerMapper.getVolunteer(page);
  }

  @Override
  public int add(Volunteer volunteer) {
    return volunteerMapper.add(volunteer);
  }

  @Override
  public int delete(int id) {
    return volunteerMapper.delete(id);
  }

  @Override
  public int update(Volunteer volunteer) {
    return volunteerMapper.update(volunteer);
  }

  @Override
  public int getCount(VolunteerPage page) {
    return volunteerMapper.getCount(page);
  }
}
