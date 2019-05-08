package com.example.demo.controller;

import com.example.demo.domain.Employee;
import com.example.demo.domain.EmployeePage;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/employee")
public class EmployeeController {


  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(value = "getEmployee",method = RequestMethod.POST)
  public Map<String,Object> selectBypage(@RequestBody EmployeePage page){
    Map<String ,Object> map=new HashMap<String ,Object>();
    int size=page.getSize();
    if(size==0){
      page.setSize(10);
    }
    page.calculateStart();
    List<Employee> employees=employeeService.selectBypage(page);
    int count=getCount(page);
    map.put("rows",employees);
    map.put("total",count);
    return map;
  }


  public int getCount(EmployeePage page){
    return employeeService.getCount(page);
  }


  @RequestMapping(value = "add",method = RequestMethod.POST)
  public void addEmployee(@RequestBody Employee employee){
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    if(employee.getEntry_time()!=null){
      try {
        Date data=f.parse(f.format(employee.getEntry_time()));
        employee.setEntry_time(data);
      } catch(ParseException px) {
        px.printStackTrace();
      }
    }
    employeeService.addEmployee(employee);
  }
  @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
  public void deleteEmployee(@PathVariable("id")int id){
    employeeService.deleteEmployee(id);
  }


  @RequestMapping(value = "update",method = RequestMethod.PUT)
  public void updateEmployee(@RequestBody Employee employee){
    employeeService.updateEmployee(employee);
  }


}
