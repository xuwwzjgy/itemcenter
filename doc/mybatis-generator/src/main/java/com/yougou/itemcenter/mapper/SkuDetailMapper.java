package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.SkuDetail;
import com.yougou.itemcenter.domain.example.SkuDetailExample;
import java.util.List;

public interface SkuDetailMapper {
    int countByExample(SkuDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkuDetail record);

    int insertSelective(SkuDetail record);

    List<SkuDetail> selectByExample(SkuDetailExample example);

    SkuDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SkuDetail record);

    int updateByPrimaryKey(SkuDetail record);
}