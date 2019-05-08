package com.example.demo.service;

import com.example.demo.domain.Goods;
import com.example.demo.domain.GoodsPage;

import java.util.List;

public interface GoodsService {
  public int addGoods(Goods goods);
  public int deleteGoods(int id);
  public int updateGoods(Goods goods);
  public List<Goods> selectBypage(GoodsPage page);
  public int getCount(GoodsPage page);
}
