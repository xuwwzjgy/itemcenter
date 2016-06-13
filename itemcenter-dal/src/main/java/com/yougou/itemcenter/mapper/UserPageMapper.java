package com.yougou.itemcenter.mapper;

import com.yougou.itemcenter.domain.UserPage;
import com.yougou.itemcenter.domain.UserPageExample;
import java.util.List;

public interface UserPageMapper {
    int countByExample(UserPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPage record);

    int insertSelective(UserPage record);

    List<UserPage> selectByExample(UserPageExample example);

    UserPage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPage record);

    int updateByPrimaryKey(UserPage record);
}