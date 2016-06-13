import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.BrandDTO;
import com.yougou.itemcenter.domain.request.BrandRequest;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.BrandReadService;
import com.yougou.itemcenter.service.backend.BrandWriteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-dal.xml",
		"classpath:spring-mybatis.xml" })
public class TestBrandService {

	private static final Logger LOGGER = Logger
			.getLogger(TestBrandService.class);

	@Autowired
	private BrandReadService brandReadService;

	@Autowired
	private BrandWriteService brandWriteService;
	
//	@Test
	public void testBrandList() {
		AppInfo appInfo = new AppInfo();
		try{
				BrandRequest brandRequest = new BrandRequest();
				brandRequest.setPageNo(1);
				Result<Pager<List<BrandDTO>>> result = brandReadService.queryBrandList(brandRequest, appInfo);
			LOGGER.info(JSON.toJSON(result));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDeleteBrand() {
		AppInfo appInfo = new AppInfo();
		Result<Integer> result = brandWriteService.deleteBrandById(1l, appInfo);
		LOGGER.info(JSON.toJSON(result));
	}
}