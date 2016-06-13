package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.ItemLog;
import com.yougou.itemcenter.domain.example.ItemLogExample;
import java.util.List;

public interface ItemLogMapper {
    int countByExample(ItemLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemLog record);

    int insertSelective(ItemLog record);

    List<ItemLog> selectByExample(ItemLogExample example);

    ItemLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemLog record);

    int updateByPrimaryKey(ItemLog record);
}