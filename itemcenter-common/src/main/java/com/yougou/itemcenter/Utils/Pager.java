package com.yougou.itemcenter.Utils;

import java.io.Serializable;
import java.util.List;

/**
 * @author hzxuwangwei
 *
 * @param <T>
 */
public class Pager<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1038184723205915125L;
	
	//offset需要前台传入（第几页）
	private int offset;
	// 每页的条数，取多少数据
	private int limit = 10;
	// 分页的第一个参数，从第几条数据开始（0为第一条）
	private int start;
	// 总数
	private int total;
	
	protected List<T> list;

	
	public Pager(int offset) {
		this.setOffset(offset);
	}
	public Pager(int offset, int limit) {
		this.setLimit(limit);
		this.setOffset(offset);
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.start = (offset-1)*limit;
		this.offset = offset;
	}


	
	
}
