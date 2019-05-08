package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Oldpeople {
  private int id;
  private String p_name;
  private String sex;
  private Integer age;
  private String nation;
  private String id_card;
  private String phone;
  @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
  private Date register_time;
  private String floor_serialNumber;
  private String room_serialNumber;
  private Integer room_type;
  private String relation_name;
  private String relation_phone;
  private String address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getP_name() {
    return p_name;
  }

  public void setP_name(String p_name) {
    this.p_name = p_name;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Date getRegister_time() {
    return register_time;
  }

  public void setRegister_time(Date register_time) {
    this.register_time = register_time;
  }

  public String getFloor_serialNumber() {
    return floor_serialNumber;
  }

  public void setFloor_serialNumber(String floor_serialNumber) {
    this.floor_serialNumber = floor_serialNumber;
  }

  public String getRoom_serialNumber() {
    return room_serialNumber;
  }

  public void setRoom_serialNumber(String room_serialNumber) {
    this.room_serialNumber = room_serialNumber;
  }

  public Integer getRoom_type() {
    return room_type;
  }

  public void setRoom_type(Integer room_type) {
    this.room_type = room_type;
  }

  public String getRelation_name() {
    return relation_name;
  }

  public void setRelation_name(String relation_name) {
    this.relation_name = relation_name;
  }

  public String getRelation_phone() {
    return relation_phone;
  }

  public void setRelation_phone(String relation_phone) {
    this.relation_phone = relation_phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
