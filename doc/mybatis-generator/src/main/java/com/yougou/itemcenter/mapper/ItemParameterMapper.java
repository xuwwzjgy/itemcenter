package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.ItemParameter;
import com.yougou.itemcenter.domain.example.ItemParameterExample;
import java.util.List;

public interface ItemParameterMapper {
    int countByExample(ItemParameterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemParameter record);

    int insertSelective(ItemParameter record);

    List<ItemParameter> selectByExample(ItemParameterExample example);

    ItemParameter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemParameter record);

    int updateByPrimaryKey(ItemParameter record);
}