package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.Item;
import com.yougou.itemcenter.domain.example.ItemExample;

import java.util.List;

public interface ItemMapper {
    int countByExample(ItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);

    Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}