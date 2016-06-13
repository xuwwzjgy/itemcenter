package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.Category;
import com.yougou.itemcenter.domain.example.CategoryExample;
import java.util.List;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}