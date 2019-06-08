package com.example.demo.service;

import com.example.demo.domain.Comments;
import com.example.demo.domain.CommentsPage;

import java.util.List;

public interface CommentsService {
  public int add(Comments comments);
  public int delete(String cname);
  public List<Comments> selectBypage(CommentsPage page);
  public int getCount();
}
