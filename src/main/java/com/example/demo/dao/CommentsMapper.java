package com.example.demo.dao;

import com.example.demo.domain.Comments;
import com.example.demo.domain.CommentsPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;

@Mapper
@Repository
public interface CommentsMapper {
  public int add(Comments comments);
  public int delete(String cname);
  public List<Comments> selectBypage(CommentsPage page);
  public int getCount();
}
