package com.example.demo.service;

import com.example.demo.domain.Cpeople;

public interface CpeopleService {
  public Cpeople login(Cpeople cpeople);
  public Cpeople verify(String name);
  public int register(Cpeople cpeople);
}
