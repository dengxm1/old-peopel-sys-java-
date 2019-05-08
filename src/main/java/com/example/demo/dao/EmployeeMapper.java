package com.example.demo.dao;

import com.example.demo.domain.Employee;
import com.example.demo.domain.EmployeePage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
  public List<Employee> selectBypage(EmployeePage page);
  public int addEmployee(Employee employee);
  public int deleteEmployee(int id);
  public int updateEmployee(Employee employee);
  public int getCount(EmployeePage page);

}
