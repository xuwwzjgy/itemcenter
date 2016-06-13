package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.Sku;
import com.yougou.itemcenter.domain.example.SkuExample;

import java.util.List;

public interface SkuMapper {
    int countByExample(SkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sku record);

    int insertSelective(Sku record);

    List<Sku> selectByExample(SkuExample example);

    Sku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sku record);

    int updateByPrimaryKey(Sku record);
}