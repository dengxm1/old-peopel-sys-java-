package com.example.demo.domain;

public class YlaoyuanPage {
  private int pageNo;
  private int size;
  private int start;
  private String province;
  private String city;
  private String area;
  private String bed_range;
  private Integer low_bed;
  private Integer top_bed;
  private String price;
  private Integer bottom_price;
  private Integer top_price;
  private String accept_object;
  private String feature_serve;
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

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getBed_range() {
    return bed_range;
  }

  public void setBed_range(String bed_range) {
    this.bed_range = bed_range;
  }

  public Integer getLow_bed() {
    return low_bed;
  }

  public void setLow_bed(Integer low_bed) {
    this.low_bed = low_bed;
  }

  public Integer getTop_bed() {
    return top_bed;
  }

  public void setTop_bed(Integer top_bed) {
    this.top_bed = top_bed;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Integer getBottom_price() {
    return bottom_price;
  }

  public void setBottom_price(Integer bottom_price) {
    this.bottom_price = bottom_price;
  }

  public Integer getTop_price() {
    return top_price;
  }

  public void setTop_price(Integer top_price) {
    this.top_price = top_price;
  }

  public String getAccept_object() {
    return accept_object;
  }

  public void setAccept_object(String accept_object) {
    this.accept_object = accept_object;
  }

  public String getFeature_serve() {
    return feature_serve;
  }

  public void setFeature_serve(String feature_serve) {
    this.feature_serve = feature_serve;
  }
}
