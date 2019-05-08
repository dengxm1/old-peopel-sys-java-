package com.example.demo.domain;

public class Floor {
  private int id;
  private String floor_serialNumber;
  private Integer room_type;
  private Integer room_amount;
  private Integer bed_amount;
  private Integer people_amount;
  private Integer empty_bed;
  private Integer empty_room;

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

  public Integer getRoom_type() {
    return room_type;
  }

  public void setRoom_type(Integer room_type) {
    this.room_type = room_type;
  }

  public Integer getRoom_amount() {
    return room_amount;
  }

  public void setRoom_amount(Integer room_amount) {
    this.room_amount = room_amount;
  }

  public Integer getBed_amount() {
    return bed_amount;
  }

  public void setBed_amount(Integer bed_amount) {
    this.bed_amount = bed_amount;
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

  public Integer getEmpty_room() {
    return empty_room;
  }

  public void setEmpty_room(Integer empty_room) {
    this.empty_room = empty_room;
  }
}
