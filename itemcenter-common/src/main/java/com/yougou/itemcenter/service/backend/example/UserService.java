package com.yougou.itemcenter.service.backend.example;

import java.util.List;

import com.yougou.itemcenter.domain.dto.UserInfoDTO;

public interface UserService {

	UserInfoDTO getUserById(int id);
	
	List<UserInfoDTO> getUsers();
	
	int insert(UserInfoDTO userInfo);
}