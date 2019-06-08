package com.example.demo.service;

import com.example.demo.domain.Volunteer;
import com.example.demo.domain.VolunteerPage;

import java.util.List;

public interface VolunteerService {
  public List<Volunteer> getVolunteer(VolunteerPage page);
  public int add(Volunteer volunteer);
  public int delete(int id);
  public int update(Volunteer volunteer);
  public int getCount(VolunteerPage page);
}
