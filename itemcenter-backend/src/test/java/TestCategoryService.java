import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.CategoryReadService;
import com.yougou.itemcenter.service.backend.CategoryWriteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-dal.xml",
		"classpath:spring-mybatis.xml" })
public class TestCategoryService {

	private static final Logger LOGGER = Logger
			.getLogger(TestCategoryService.class);

	@Autowired
	private CategoryReadService categoryReadService;
	
	@Autowired
	private CategoryWriteService categoryWriteService;
	
	@Test
	public void testCategoryDTOTree() {
		AppInfo appInfo = new AppInfo();
		try{
			CategoryRequest categoryRequest = new CategoryRequest();
			Result<List<CategoryDTO>> result = categoryReadService.queryCategoryTree(categoryRequest, appInfo);
			LOGGER.info(JSON.toJSON(result));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertCategory(){
		AppInfo appInfo = new AppInfo();
		categoryWriteService.deleteCategoryById(12l, appInfo);
	}
}