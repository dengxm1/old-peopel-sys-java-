package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Oldpeople {
  private int id;
  private String p_name;
  private String id_card;
  private String sex;
  private Integer age;
  private String home_address;
  private String tel;
  @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
  private Date lastvisit_time;
  private String linkman;
  private String linkman_address;
  private String linkman_tel;
  private String picture;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getP_name() {
    return p_name;
  }

  public void setP_name(String p_name) {
    this.p_name = p_name;
  }

  public String getId_card() {
    return id_card;
  }

  public void setId_card(String id_card) {
    this.id_card = id_card;
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

  public String getHome_address() {
    return home_address;
  }

  public void setHome_address(String home_address) {
    this.home_address = home_address;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public Date getLastvisit_time() {
    return lastvisit_time;
  }

  public void setLastvisit_time(Date lastvisit_time) {
    this.lastvisit_time = lastvisit_time;
  }

  public String getLinkman() {
    return linkman;
  }

  public void setLinkman(String linkman) {
    this.linkman = linkman;
  }

  public String getLinkman_address() {
    return linkman_address;
  }

  public void setLinkman_address(String linkman_address) {
    this.linkman_address = linkman_address;
  }

  public String getLinkman_tel() {
    return linkman_tel;
  }

  public void setLinkman_tel(String linkman_tel) {
    this.linkman_tel = linkman_tel;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
