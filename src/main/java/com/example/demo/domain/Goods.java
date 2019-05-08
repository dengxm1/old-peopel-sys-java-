package com.example.demo.domain;

public class Goods {
  private int id;
  private String goods_serialNumber;
  private String goods_name;
  private String goods_type;
  private Integer goods_amount;
  private Integer goods_price;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public Integer getGoods_amount() {
    return goods_amount;
  }

  public void setGoods_amount(Integer goods_amount) {
    this.goods_amount = goods_amount;
  }

  public Integer getGoods_price() {
    return goods_price;
  }

  public void setGoods_price(Integer goods_price) {
    this.goods_price = goods_price;
  }
}
