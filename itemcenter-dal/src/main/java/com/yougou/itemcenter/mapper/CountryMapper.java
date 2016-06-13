package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.Country;
import com.yougou.itemcenter.domain.example.CountryExample;

import java.util.List;

public interface CountryMapper {
    int countByExample(CountryExample example);

    int insert(Country record);

    int insertSelective(Country record);

    List<Country> selectByExample(CountryExample example);
}