package com.yougou.itemcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.UserPage;
import com.yougou.itemcenter.domain.UserPageExample;
import com.yougou.itemcenter.mapper.UserPageMapper;
import com.yougou.itemcenter.service.backend.example.PageService;

@Service("pageService")
public class PageServiceImpl implements PageService {
	@Autowired
	private UserPageMapper userPageMapper;
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Pager queryBattleLogInfo(Pager pager, Integer rid) {
		UserPageExample pveBattleLogExample = new UserPageExample();
		UserPageExample.Criteria criteria = pveBattleLogExample.createCriteria();
		if (rid != null) {
			criteria.andIdEqualTo(rid);
		}
		if (pager != null) {
			int count = this.userPageMapper.countByExample(pveBattleLogExample);
			pager.setTotal(count);
			pveBattleLogExample.setLimitStart(pager.getStart());
			// 分页的第一个参数，从第几条数据开始（0为第一条）
			pveBattleLogExample.setLimitEnd(pager.getLimit());
			// 每页的条数，取多少数据
		}
		List<UserPage> userList = this.userPageMapper.selectByExample(pveBattleLogExample);
		pager.setList(userList);
		return pager;
	}
}
