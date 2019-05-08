package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeMapper;
import com.example.demo.domain.Employee;
import com.example.demo.domain.EmployeePage;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeMapper employeeMapper;
  @Override
  public List<Employee> selectBypage(EmployeePage page) {
    return employeeMapper.selectBypage(page);
  }

  @Override
  public int addEmployee(Employee employee) {
    return employeeMapper.addEmployee(employee);
  }

  @Override
  public int deleteEmployee(int id) {
    return employeeMapper.deleteEmployee(id);
  }

  @Override
  public int updateEmployee(Employee employee) {
    return employeeMapper.updateEmployee(employee);
  }
  @Override
  public int getCount(EmployeePage page) {
    return employeeMapper.getCount(page);
  }
}
