package com.example.demo.dao;

import com.example.demo.domain.Goods;
import com.example.demo.domain.GoodsPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface GoodsMapper {
  public int addGoods(Goods goods);
  public int deleteGoods(int id);
  public int updateGoods(Goods goods);
  public List<Goods> selectBypage(GoodsPage page);
  public int getCount(GoodsPage page);

}
