package com.example.demo.domain;

public class ProvincePage {
  private int pageNo;
  private int size;
  private int start;
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
}
