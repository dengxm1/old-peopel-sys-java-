package com.example.demo.domain;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//护工
public class Nursing {
  private int id;
  //名字
  private String n_name;
  private String sex;
  private Integer age;
  //籍贯
  private String native_place;
  //住址
  private String address;
  //更新时间
  @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
  private Date update_time;
  //工作经验
  private String work_experience;
  //最低薪资
  private Integer low_salary;
  //最高薪资
  private Integer top_salary;
  //属相
  private String shuxiang;
  //名族
  private String nation;
  //身高
  private float height;
  //体重
  private float weight;
  //语言
  private String language;

  //照片url
  private String picture;
  //固话
  private String tel;
  //手机
  private String phone;
  //简介
  private String intro;

  private String main_tasks;


  public Date getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Date update_time) {
    this.update_time = update_time;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getN_name() {
    return n_name;
  }

  public void setN_name(String n_name) {
    this.n_name = n_name;
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

  public String getNative_place() {
    return native_place;
  }

  public void setNative_place(String native_place) {
    this.native_place = native_place;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getWork_experience() {
    return work_experience;
  }

  public void setWork_experience(String work_experience) {
    this.work_experience = work_experience;
  }

  public Integer getLow_salary() {
    return low_salary;
  }

  public void setLow_salary(Integer low_salary) {
    this.low_salary = low_salary;
  }

  public Integer getTop_salary() {
    return top_salary;
  }

  public void setTop_salary(Integer top_salary) {
    this.top_salary = top_salary;
  }

  public String getShuxiang() {
    return shuxiang;
  }

  public void setShuxiang(String shuxiang) {
    this.shuxiang = shuxiang;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getMain_tasks() {
    return main_tasks;
  }

  public void setMain_tasks(String main_tasks) {
    this.main_tasks = main_tasks;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }
}
