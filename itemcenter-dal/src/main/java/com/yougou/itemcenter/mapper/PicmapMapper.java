package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.meta.Picmap;
import com.yougou.itemcenter.domain.example.PicmapExample;

import java.util.List;

public interface PicmapMapper {
    int countByExample(PicmapExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Picmap record);

    int insertSelective(Picmap record);

    List<Picmap> selectByExample(PicmapExample example);

    Picmap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Picmap record);

    int updateByPrimaryKey(Picmap record);
}