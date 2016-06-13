package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.Brand;
import com.yougou.itemcenter.domain.meta.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByPrimaryKey(Long brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Long brandId);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}