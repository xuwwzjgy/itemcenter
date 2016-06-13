package com.yougou.itemcenter.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.ItemParamDTO;
import com.yougou.itemcenter.domain.dto.ItemParamOptionDTO;
import com.yougou.itemcenter.domain.example.ItemParamOptionExample;
import com.yougou.itemcenter.domain.example.ItemParameterExample;
import com.yougou.itemcenter.domain.meta.ItemParamOption;
import com.yougou.itemcenter.domain.meta.ItemParameter;
import com.yougou.itemcenter.domain.request.trade.ParameterRequest;
import com.yougou.itemcenter.mapper.ItemParamOptionMapper;
import com.yougou.itemcenter.mapper.ItemParameterMapper;

@Repository
public class ParamReadManagerImpl implements ParamReadManager {

	@Autowired
	private ItemParameterMapper itemParameterMapper;
	
	@Autowired
	private ItemParamOptionMapper itemParamOptionMapper;
	
	/**
	 * 商品参数查询功能--按照属性名查找
	 */
	@Override
	public Pager<ItemParamDTO> queryItemParamListByParaName(ParameterRequest parameterRequest) {

		Pager<ItemParamDTO> pager = new Pager<ItemParamDTO>(parameterRequest.getOffset());
		Integer isRequired = parameterRequest.getIsRequired();
		Integer detailType = parameterRequest.getDetailType();
		String content = parameterRequest.getContent();
		//查找商品参数表
		List<ItemParameter> itemParamList = queryItemParamList(pager, isRequired, detailType, content,null);
		//获取商品参数ID List
		List<Long> prodParamidList = new ArrayList<Long>();
		for (ItemParameter itemParameter : itemParamList) {
			prodParamidList.add(itemParameter.getId());
		}
		
		//查找商品参数选项表
		List<ItemParamOption> itemParamOptionList = queryParamOptionList(prodParamidList);
		
		Multimap<Long, ItemParamOptionDTO> multimap = ArrayListMultimap.create();
		for (ItemParamOption itemParamOption : itemParamOptionList) {
			ItemParamOptionDTO itemParamOptionDTO = new ItemParamOptionDTO();
			itemParamOptionDTO.setOptId(itemParamOption.getId());
			itemParamOptionDTO.setOptValue(itemParamOption.getValue());
			multimap.put(itemParamOption.getProdparamid(), itemParamOptionDTO);
		}
		
		List<ItemParamDTO> itemParamDTOList = new ArrayList<ItemParamDTO>();
		addItemParameter2DTO(itemParamList, multimap, itemParamDTOList);
		
		pager.setList(itemParamDTOList);
		return pager;
		
	}
	
	/**
	 * 商品参数查询功能--按照属性值查找
	 * 
	 */
	
	@Override
	public Pager<ItemParamDTO> queryItemParamListOptValue(ParameterRequest parameterRequest) {
		
		Pager<ItemParamDTO> pager = new Pager<ItemParamDTO>(parameterRequest.getOffset());
		Integer isRequired = parameterRequest.getIsRequired();
		Integer detailType = parameterRequest.getDetailType();
		String content = parameterRequest.getContent();
		
//从商品参数选项表查询出商品参数ID
		ItemParamOptionExample itemParamOptionExample = new ItemParamOptionExample();
		ItemParamOptionExample.Criteria criteriaIPO = itemParamOptionExample.createCriteria();
		if (content != null) {
			criteriaIPO.andValueLike(content);
		}
		List<ItemParamOption> itemParamOptionList = itemParamOptionMapper.selectByExample(itemParamOptionExample);

//从商品参数表中查出商品参数信息
		List<Long> paramidList = new ArrayList<Long>();
		for (ItemParamOption itemParamOption : itemParamOptionList) {
			paramidList.add(itemParamOption.getProdparamid());
		}
		paramidList = new ArrayList<Long>(new HashSet<Long>(paramidList));//去重
		List<ItemParameter> itemParamList = queryItemParamList(pager, isRequired, detailType, content,paramidList);
		
//从商品参数选项表查询出商品参数ID对应的所有商品参数选项值(属性值)
		List<ItemParamOption> itemParamOptList = queryParamOptionList(paramidList);
		
		Multimap<Long, ItemParamOptionDTO> multimap = ArrayListMultimap.create();
		for (ItemParamOption itemParamOption : itemParamOptList) {
			ItemParamOptionDTO itemParamOptionDTO = new ItemParamOptionDTO();
			itemParamOptionDTO.setOptId(itemParamOption.getId());
			itemParamOptionDTO.setOptValue(itemParamOption.getValue());
			multimap.put(itemParamOption.getProdparamid(), itemParamOptionDTO);
		}
		List<ItemParamDTO> itemParamDTOList = new ArrayList<ItemParamDTO>();
		addItemParameter2DTO(itemParamList, multimap, itemParamDTOList);
		pager.setList(itemParamDTOList);
		return pager;
	}
	
	
	/**
	 * 查找商品参数选项表
	 * @param prodParamidList
	 * @return
	 */
	private List<ItemParamOption> queryParamOptionList(List<Long> prodParamidList) {
		ItemParamOptionExample itemParamOptionExample = new ItemParamOptionExample();
		ItemParamOptionExample.Criteria criteriaIPO = itemParamOptionExample.createCriteria();
		if (prodParamidList.size()>0) {
			criteriaIPO.andProdparamidIn(prodParamidList);
		}
		List<ItemParamOption> itemParamOptionList = itemParamOptionMapper.selectByExample(itemParamOptionExample);
		return itemParamOptionList;
	}
	/**
	 * 查找商品参数表
	 * @param pager
	 * @param isRequired
	 * @param detailType
	 * @param content
	 * @return
	 */
	private List<ItemParameter> queryItemParamList(Pager<ItemParamDTO> pager, 
												   Integer isRequired, 
												   Integer detailType,
												   String content,
												   List<Long> list) {
		ItemParameterExample itemParameterExample = new ItemParameterExample();
		ItemParameterExample.Criteria criteria = itemParameterExample.createCriteria();
		if (isRequired != null) {
			criteria.andIsrequiredEqualTo(isRequired);
		}
		if (detailType != null) {
			criteria.andDetailtypeEqualTo(detailType);
		}
		if (content != null) {
			criteria.andNameLike(content);
		}
		if (list != null){
			criteria.andIdIn(list);
		}
		
		int count = this.itemParameterMapper.countByExample(itemParameterExample);
		pager.setTotal(count);
		itemParameterExample.setLimitStart(pager.getStart());
		// 分页的第一个参数，从第几条数据开始（0为第一条）
		itemParameterExample.setLimitEnd(pager.getLimit());
		// 每页的条数，取多少数据
		List<ItemParameter> itemParamList = this.itemParameterMapper.selectByExample(itemParameterExample);
		return itemParamList;
	}

	/**
	 * 组装DTO
	 * @param itemParamList
	 * @param multimap
	 * @param itemParamDTOList
	 */
	private void addItemParameter2DTO(List<ItemParameter> itemParamList, Multimap<Long, ItemParamOptionDTO> multimap,
			List<ItemParamDTO> itemParamDTOList) {
		for (ItemParameter itemParameter : itemParamList) {
			ItemParamDTO itemParamDTO =  new ItemParamDTO();
			itemParamDTO.setId(itemParameter.getId());
			itemParamDTO.setName(itemParameter.getName());
			itemParamDTO.setDetailtype(itemParameter.getDetailtype());
			itemParamDTO.setList((List)multimap.get(itemParameter.getId()));
			itemParamDTOList.add(itemParamDTO);
		}
	}





	

}
