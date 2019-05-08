package com.example.demo.service.impl;

import com.example.demo.dao.GoodsMapper;
import com.example.demo.domain.Goods;
import com.example.demo.domain.GoodsPage;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {

  @Autowired
  private GoodsMapper goodsMapper;
  @Override
  public int addGoods(Goods goods) {
    return goodsMapper.addGoods(goods);
  }

  @Override
  public int deleteGoods(int id) {
    return goodsMapper.deleteGoods(id);
  }

  @Override
  public int updateGoods(Goods goods) {
    return goodsMapper.updateGoods(goods);
  }

  @Override
  public List<Goods> selectBypage(GoodsPage page) {
    return goodsMapper.selectBypage(page);
  }

  @Override
  public int getCount(GoodsPage page) {
    return goodsMapper.getCount(page);
  }
}
