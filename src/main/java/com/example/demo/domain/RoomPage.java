package com.example.demo.domain;

public class RoomPage {
  private int pageNo;
  private int size;
  private int start;
  private String floor_serialNumber;
  private String room_serialNumber;
  private int empty_bed;
  private int room_type;

  public void calculateStart(){
    start=(pageNo-1)*size;
  }

  public int getRoom_type() {
    return room_type;
  }

  public void setRoom_type(int room_type) {
    this.room_type = room_type;
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

  public int getEmpty_bed() {
    return empty_bed;
  }

  public void setEmpty_bed(int empty_bed) {
    this.empty_bed = empty_bed;
  }
}
