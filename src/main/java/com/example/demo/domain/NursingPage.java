package com.example.demo.domain;

public class NursingPage {
  private int pageNo;
  private int size;
  private int start;
  private String native_place;
  private String shuxiang;
  private String age;
  private Integer low_age;
  private Integer top_age;
  private Integer low_salary;
  private Integer top_salary;
  private String hope_salary;
  public void calculateStart(){
    start=(pageNo-1)*size;
  }

  public String getNative_place() {
    return native_place;
  }

  public void setNative_place(String native_place) {
    this.native_place = native_place;
  }

  public int getPageNo() {
    return pageNo;
  }

  public void setPageNo(int pageNo) {
    this.pageNo = pageNo;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public String getShuxiang() {
    return shuxiang;
  }

  public void setShuxiang(String shuxiang) {
    this.shuxiang = shuxiang;
  }

  public Integer getLow_age() {
    return low_age;
  }

  public void setLow_age(Integer low_age) {
    this.low_age = low_age;
  }

  public Integer getTop_age() {
    return top_age;
  }

  public void setTop_age(Integer top_age) {
    this.top_age = top_age;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getHope_salary() {
    return hope_salary;
  }

  public void setHope_salary(String hope_salary) {
    this.hope_salary = hope_salary;
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
}
