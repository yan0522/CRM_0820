package com.atguigu.crm.entity;

import java.util.List;

public class Page<T> {

	private int pageNo;
	private long totalCount;
	private int totalPage;
	private int PageSize = 5;

	private List<T> content;

	public Page(int pageNo, long totalCount) {
		super();

		this.pageNo = pageNo;
		this.totalCount = totalCount;
		totalPage = (int) (totalCount / PageSize);
		if (totalCount % PageSize != 0) {
			totalPage++;
		}
		if (pageNo > totalPage) {
			pageNo = totalPage;
		}
		if (pageNo < 1) {
			pageNo = 1;
		}
	}

	public Integer getPageNo() {
		return pageNo;
	}


	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return PageSize;
	}

	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public boolean getHasPrev() {
		return getPageNo() > 1;
	}

	public boolean getHasNext() {
		return getPageNo() < getTotalPage();
	}

	public int getPrev() {
		return getPageNo() - 1;
	}

	public int getNext() {
		return getPageNo() + 1;
	}
}
