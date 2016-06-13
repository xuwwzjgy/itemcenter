package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.Brand;
import com.yougou.itemcenter.domain.example.BrandExample;
import java.util.List;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);
}