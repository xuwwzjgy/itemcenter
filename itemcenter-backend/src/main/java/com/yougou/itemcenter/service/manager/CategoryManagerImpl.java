package com.yougou.itemcenter.service.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.example.CategoryExample;
import com.yougou.itemcenter.domain.meta.Category;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.mapper.CategoryMapper;

@Component
public class CategoryManagerImpl implements CategoryManager {
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<CategoryDTO> queryCategoryTree(CategoryRequest categoryRequest) {
		Long id = categoryRequest.getId()==null?0:categoryRequest.getId();
		Integer level = categoryRequest.getLevel()==null?0:categoryRequest.getLevel();
		Long pid = categoryRequest.getSupercategoryid()==null?0:categoryRequest.getSupercategoryid();
		CategoryExample example = new CategoryExample();
		if(id>0){
			example.createCriteria().andIdEqualTo(id);
		}
		if(level>0){
			example.createCriteria().andLevelEqualTo(level);
		}
		List<Category> categoryList = categoryMapper.selectByExample(example);
		List<CategoryDTO> dtoList = treeGenerator(categoryList, pid);
		return dtoList;
	}
	
	private List<CategoryDTO> treeGenerator(List<Category> list, Long parentId){
		List<CategoryDTO> dtoList = new ArrayList<>();
		for(Category c:list){
			if (parentId == c.getSuperCategoryId()) {
				CategoryDTO dto = new CategoryDTO();
				BeanUtils.copyProperties(c, dto);
				List<CategoryDTO> tmpList = treeGenerator(list, c.getId());
				dto.setCategoryDTOList(tmpList);
				dtoList.add(dto);
			}
		}
		return dtoList;
	}
	@Override
	public Long saveCategory(CategoryRequest categoryRequest){
		int r = 0;
		Category c = new Category();
		BeanUtils.copyProperties(categoryRequest, c);
		if(categoryRequest.getId()!=null && categoryRequest.getId()>0){//更新
			r = categoryMapper.updateByPrimaryKeySelective(c);
		}else{//新增
			c.setGmtCreate(new Date());
			r = categoryMapper.insertSelective(c);
		}
		return c.getId();
	}
	
	@Override
	public Integer deleteCategoryById(Long id){
		Category c = new Category();
		c.setIsDelete(1);
		c.setId(id);
		return categoryMapper.updateByPrimaryKeySelective(c);
	}
	
}
