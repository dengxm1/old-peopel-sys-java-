package com.example.demo.domain;

public class OldpeoplePage {
  private int pageNo;
  private int size;
  private int start;
  private String p_name;
  private String id_card;
  private String relation_name;
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

  public String getRelation_name() {
    return relation_name;
  }

  public void setRelation_name(String relation_name) {
    this.relation_name = relation_name;
  }
}
