package com.example.demo.domain;

public class GoodsPage {
  private int pageNo;
  private int size;
  private int start;
 private String goods_serialNumber;
 private String goods_name;
 private String goods_type;
  public void calculateStart(){
    start=(pageNo-1)*size;
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

  public String getGoods_serialNumber() {
    return goods_serialNumber;
  }

  public void setGoods_serialNumber(String goods_serialNumber) {
    this.goods_serialNumber = goods_serialNumber;
  }

  public String getGoods_name() {
    return goods_name;
  }

  public void setGoods_name(String goods_name) {
    this.goods_name = goods_name;
  }

  public String getGoods_type() {
    return goods_type;
  }

  public void setGoods_type(String goods_type) {
    this.goods_type = goods_type;
  }
}
