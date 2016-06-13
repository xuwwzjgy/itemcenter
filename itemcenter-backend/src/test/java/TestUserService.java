import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.UserInfoDTO;
import com.yougou.itemcenter.service.backend.example.PageService;
import com.yougou.itemcenter.service.backend.example.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-dal.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;
	
	@Autowired
	private PageService pageService;

//	@Test
	public void testPageUser() {//分页example
		Pager pager = new Pager(2,2);//第几页
		try{
			pager = pageService.queryBattleLogInfo(pager, null);
			LOGGER.info(JSON.toJSON(pager));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testQueryById1() {
		try{
			UserInfoDTO userInfo = userService.getUserById(1);
			LOGGER.info(JSON.toJSON(userInfo));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void testQueryAll() {
		try{
		List<UserInfoDTO> userInfos = userService.getUsers();
		LOGGER.info(JSON.toJSON(userInfos));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

//	@Test
	public void testInsert() {
		UserInfoDTO userInfo = new UserInfoDTO();
//		userInfo.setId(0);
		userInfo.setName("playerABC");
		int result = userService.insert(userInfo);
		System.out.println(result);
	}
}