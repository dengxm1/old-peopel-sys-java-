package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public class Volunteer {
  private int id;
  private String v_name;
  private String sex;
  private Integer age;
  private String province;
  private String city;
  private String area;
  //服务的时间
  @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
  private Date service_time;
  //被服务老人
  private String serve_object;
  //服务事项
  private String serve_item;
  private String phone;
  private String picture;

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getV_name() {
    return v_name;
  }

  public void setV_name(String v_name) {
    this.v_name = v_name;
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

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Date getService_time() {
    return service_time;
  }

  public void setService_time(Date service_time) {
    this.service_time = service_time;
  }

  public String getServe_object() {
    return serve_object;
  }

  public void setServe_object(String serve_object) {
    this.serve_object = serve_object;
  }

  public String getServe_item() {
    return serve_item;
  }

  public void setServe_item(String serve_item) {
    this.serve_item = serve_item;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
