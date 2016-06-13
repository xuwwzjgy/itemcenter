package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.SaleParamOption;
import com.yougou.itemcenter.domain.example.SaleParamOptionExample;

import java.util.List;

public interface SaleParamOptionMapper {
    int countByExample(SaleParamOptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleParamOption record);

    int insertSelective(SaleParamOption record);

    List<SaleParamOption> selectByExample(SaleParamOptionExample example);

    SaleParamOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SaleParamOption record);

    int updateByPrimaryKey(SaleParamOption record);
}