package com.yougou.itemcenter.constants;

public enum DetailType {

	
	SINGLE_SELECT(1, "单选框"), 
	TEXT(2, "输入框"),
	TEXT_AREA(3, "输入区域"), 
	MULTI_SELECT(4, "多选");
	
	private int type;
	private String desc;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	DetailType(int type,String desc){
		this.type = type;
		this.desc = desc;
	}

}
