package com.example.demo.service;

import com.example.demo.domain.Employee;
import com.example.demo.domain.EmployeePage;

import java.util.List;

public interface EmployeeService {
  public List<Employee> selectBypage(EmployeePage page);
  public int addEmployee(Employee employee);
  public int deleteEmployee(int id);
  public int updateEmployee(Employee employee);
  public int getCount(EmployeePage page);
}
