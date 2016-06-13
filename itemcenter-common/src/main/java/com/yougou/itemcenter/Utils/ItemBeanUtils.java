package com.yougou.itemcenter.Utils;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

public class ItemBeanUtils {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void copyList(List origin, List target, Class targetClazz){
		if(CollectionUtils.isNotEmpty(origin)){
			List list = (List)origin;
				for(Object info:list){
					try {
						Object dto = targetClazz.newInstance();
						BeanUtils.copyProperties(info, dto);
						target.add(dto);
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
	}
}
