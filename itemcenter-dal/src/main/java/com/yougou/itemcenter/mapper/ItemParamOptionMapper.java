package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.ItemParamOption;
import com.yougou.itemcenter.domain.example.ItemParamOptionExample;

import java.util.List;

public interface ItemParamOptionMapper {
    int countByExample(ItemParamOptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemParamOption record);

    int insertSelective(ItemParamOption record);

    List<ItemParamOption> selectByExample(ItemParamOptionExample example);

    ItemParamOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemParamOption record);

    int updateByPrimaryKey(ItemParamOption record);
}