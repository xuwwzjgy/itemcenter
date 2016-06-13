package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.SaleParameter;
import com.yougou.itemcenter.domain.example.SaleParameterExample;
import java.util.List;

public interface SaleParameterMapper {
    int countByExample(SaleParameterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaleParameter record);

    int insertSelective(SaleParameter record);

    List<SaleParameter> selectByExample(SaleParameterExample example);

    SaleParameter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SaleParameter record);

    int updateByPrimaryKey(SaleParameter record);
}