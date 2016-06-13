package com.yougou.itemcenter.service.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.BrandDTO;
import com.yougou.itemcenter.domain.dto.CountryDTO;
import com.yougou.itemcenter.domain.example.CountryExample;
import com.yougou.itemcenter.domain.meta.Brand;
import com.yougou.itemcenter.domain.meta.BrandExample;
import com.yougou.itemcenter.domain.meta.BrandExample.Criteria;
import com.yougou.itemcenter.domain.meta.Country;
import com.yougou.itemcenter.domain.request.BrandRequest;
import com.yougou.itemcenter.mapper.BrandMapper;
import com.yougou.itemcenter.mapper.CountryMapper;

@Component
public class BrandManagerImpl implements BrandManager {

	@Autowired
	private BrandMapper brandMapper;
	
	@Autowired
	private CountryMapper countryMapper;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Pager<List<BrandDTO>> queryBrandList(BrandRequest brandRequest) {
		String ccd = brandRequest.getCountrycode();
		String bdzh = brandRequest.getBrandnamezh();
		Pager pager = new Pager(brandRequest.getPageNo(), brandRequest.getLimit());
		List<BrandDTO> dtolist = new ArrayList<>();
		BrandExample example = new BrandExample();
		Criteria criteria = example.createCriteria();
		Criteria criteria2 = example.createCriteria();
		if(StringUtils.isNotEmpty(ccd)){
			criteria.andCountryCodeEqualTo(brandRequest.getCountrycode());
			criteria2.andCountryCodeEqualTo(brandRequest.getCountrycode());
		}
		if(StringUtils.isNotEmpty(bdzh)){
			criteria.andBrandNameZhEqualTo(brandRequest.getBrandnamezh());
			criteria2.andBrandNameEnEqualTo(brandRequest.getBrandnamezh());
		}
		example.or(criteria2);
		int count = this.brandMapper.countByExample(example);
		if(count > 0){
			pager.setTotal(count);
			example.setLimitStart(pager.getStart());
			example.setLimitEnd(pager.getLimit());
			List<Brand> brandlist = brandMapper.selectByExample(example);
			CountryExample cE = new CountryExample();
			List<Country> countryList = countryMapper.selectByExample(cE);
			Map<String,Country> countryMap = Maps.uniqueIndex(countryList, new Function <Country,String> () {  
		          public String apply(Country from) {  
		            return from.getCountrycode();  
		    }});  
		      
			for(Brand brand:brandlist){
				BrandDTO bdto = new BrandDTO();
				BeanUtils.copyProperties(brand, bdto);
				Country country = countryMap.get(bdto.getCountrycode());
				if(country!=null){
					CountryDTO cdto = new CountryDTO();
					BeanUtils.copyProperties(country, cdto);
					bdto.setCountryDTO(cdto);
				}
				dtolist.add(bdto);
			}
		}
		pager.setList(dtolist);
		return pager;
	}

	@Override
	public Long saveBrand(BrandRequest brandRequest) {
		int r = 0;
		Brand brand = new Brand();
		BeanUtils.copyProperties(brandRequest, brand);
		if(brandRequest.getBrandid()!=null && brandRequest.getBrandid()>0){//更新
			r = brandMapper.updateByPrimaryKey(brand);
		}else{//新增
			brand.setGmtCreate(new Date());
			r = brandMapper.insertSelective(brand);
		}
		return brand.getBrandId();
	}

	@Override
	public Integer deleteBrandById(Long id) {
		Brand brand = new Brand();
		brand.setBrandId(id);
		brand.setIsDelete(1);
		Integer count = brandMapper.updateByPrimaryKeySelective(brand);
		return count;
	}

}
