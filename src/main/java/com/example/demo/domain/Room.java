package com.example.demo.domain;

public class Room {
  private int id;
  private String floor_serialNumber;
  private String room_serialNumber;
  private Integer room_type;
  private Integer people_amount;
  private Integer empty_bed;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public Integer getPeople_amount() {
    return people_amount;
  }

  public void setPeople_amount(Integer people_amount) {
    this.people_amount = people_amount;
  }

  public Integer getEmpty_bed() {
    return empty_bed;
  }

  public void setEmpty_bed(Integer empty_bed) {
    this.empty_bed = empty_bed;
  }
}
