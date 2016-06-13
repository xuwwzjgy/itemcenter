package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.example.UserInfo;
import com.yougou.itemcenter.domain.example.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}