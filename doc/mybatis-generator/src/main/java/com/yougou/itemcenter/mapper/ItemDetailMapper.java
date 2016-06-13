package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.ItemDetail;
import com.yougou.itemcenter.domain.example.ItemDetailExample;
import java.util.List;

public interface ItemDetailMapper {
    int countByExample(ItemDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemDetail record);

    int insertSelective(ItemDetail record);

    List<ItemDetail> selectByExample(ItemDetailExample example);

    ItemDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemDetail record);

    int updateByPrimaryKey(ItemDetail record);
}