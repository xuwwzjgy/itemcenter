package com.yougou.itemcenter.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.Utils.ItemBeanUtils;
import com.yougou.itemcenter.domain.dto.UserInfoDTO;
import com.yougou.itemcenter.domain.example.UserInfo;
import com.yougou.itemcenter.domain.example.UserInfoExample;
import com.yougou.itemcenter.mapper.UserInfoMapper;
import com.yougou.itemcenter.service.backend.example.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfoDTO getUserById(int id) {
		UserInfo user = userInfoMapper.selectByPrimaryKey(id);
		UserInfoDTO dto = new UserInfoDTO();
			BeanUtils.copyProperties(user, dto);
		return dto;
	}

	@Override
	public List<UserInfoDTO> getUsers() {
//		List<UserInfo> list= userInfoMapper.selectAll();
		UserInfoExample example = new UserInfoExample();
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		List<UserInfoDTO> dtolist = new ArrayList<>();
		try{
			/*if(CollectionUtils.isNotEmpty(list)){
				for(UserInfo info:list){
					UserInfoDTO dto = new UserInfoDTO();
					BeanUtils.copyProperties(info, dto);
					dtolist.add(dto);
				}
			}*/
			ItemBeanUtils.copyList(list, dtolist, UserInfoDTO.class);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return dtolist;
	}

	@Override
	public int insert(UserInfoDTO userInfo) {
		int result = 0;
		try{
			UserInfo user = new UserInfo();
			BeanUtils.copyProperties(userInfo, user);
		result = userInfoMapper.insert(user);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(result);
		return result;
	}

}