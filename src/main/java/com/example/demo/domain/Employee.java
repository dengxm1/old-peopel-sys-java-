package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {
  private int id;
  private String e_name;
  private String sex;
  private Integer age;
  private String nation;
  private String id_card;
  private String address;
  private String phone;
  private String work_type;
  @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
  private Date entry_time;
  private float salary;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getE_name() {
    return e_name;
  }

  public void setE_name(String e_name) {
    this.e_name = e_name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public String getId_card() {
    return id_card;
  }

  public void setId_card(String id_card) {
    this.id_card = id_card;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWork_type() {
    return work_type;
  }

  public void setWork_type(String work_type) {
    this.work_type = work_type;
  }

  public Date getEntry_time() {
    return entry_time;
  }

  public void setEntry_time(Date entry_time) {
    this.entry_time = entry_time;
  }

  public float getSalary() {
    return salary;

  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
}
