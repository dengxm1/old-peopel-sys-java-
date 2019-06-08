package com.example.demo.service.impl;

import com.example.demo.dao.CommentsMapper;
import com.example.demo.domain.Comments;
import com.example.demo.domain.CommentsPage;
import com.example.demo.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.color.CMMException;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
  @Autowired
  private CommentsMapper commentsMapper;
  @Override
  public int add(Comments comments) {
    return commentsMapper.add(comments);
  }

  @Override
  public int delete(String cname) {
    return commentsMapper.delete(cname);
  }

  @Override
  public List<Comments> selectBypage(CommentsPage page) {
    return commentsMapper.selectBypage(page);
  }

  @Override
  public int getCount() {
    return commentsMapper.getCount();
  }
}
