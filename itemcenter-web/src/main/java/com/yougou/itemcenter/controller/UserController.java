package com.yougou.itemcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yougou.itemcenter.domain.dto.UserInfoDTO;
import com.yougou.itemcenter.service.backend.example.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		UserInfoDTO userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}
	//不加工程名 http://localhost:8080/list.html 
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody Object showUserInfos(){
		List<UserInfoDTO> userInfos = userService.getUsers();
		return userInfos.toString();
	}
}