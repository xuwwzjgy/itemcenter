package com.yougou.itemcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.CategoryReadServiceClient;

@Controller
public class CommonController {

	@Autowired
	private CategoryReadServiceClient categoryReadServiceClient;
	
	
	@RequestMapping("/categorytree/{pid}")
	public @ResponseBody String queryCategoryTree(ModelMap modelMap, @PathVariable Long pid){
		AppInfo appInfo = new AppInfo();
		CategoryRequest categoryRequest = new CategoryRequest();
		categoryRequest.setSupercategoryid(pid);
		Result<List<CategoryDTO>> result = categoryReadServiceClient.queryCategoryTree(categoryRequest, appInfo);
		return result.toString();
	}
}
