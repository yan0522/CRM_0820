package com.atguigu.crm.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalNames {

	public static final String LOGIN_USER = "user";
	public static final String MESSAGE = "message";
	public static final String SEARCH = "search_";
	public static final String SALES_CHANCE = "chance";
	public static final String SERVER_STATE_ALLOT = "已分配";
	public static final String SERVER_STATE_CREATE = "新创建";
	public static final Object SERVER_STATE_DEAL = null;
	public static final List<String> REGIONS = new ArrayList<>();
	public static final List<String> LEVELS = new ArrayList<>();
	public static final List<String> STATES = new ArrayList<>();
	public static final List<String> SERVERS = new ArrayList<>();

	public static final Map<String, Object> SEXS = new HashMap<>();
	public static final Map<String, Object> SEARCH_MAP = new HashMap<>();

	static {
		STATES.add("正常");
		STATES.add("流失预警");
		STATES.add("流失");
		STATES.add("删除");

		SEXS.put("男", "男");
		SEXS.put("女", "女");

		SEARCH_MAP.put("customer_level", "按等级");
		SEARCH_MAP.put("satify", "按满意度");
		SEARCH_MAP.put("credit", "按信用度");
	}
}
