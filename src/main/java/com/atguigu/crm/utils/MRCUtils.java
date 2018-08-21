package com.atguigu.crm.utils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MRCUtils {

	private static SimpleDateFormat format = null;
	static {
		format = new SimpleDateFormat("yyyy-MM-dd");
	}

	public static Map<String, Object> parseRequestParmas2MybatisParams(Map<String, Object> parametersMap) {
		Map<String, Object> mybatisParams = new HashMap<>();

		if (parametersMap == null || parametersMap.size() == 0) {
			return mybatisParams;
		}

		Set<Entry<String, Object>> entrySet = parametersMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			Object value = entry.getValue();
			if (value == null || value.toString().trim().length() == 0) {
				continue;
			}
			String[] split = key.split("_");
			if (split.length != 1) {
				key = split[1];
				if ("like".equalsIgnoreCase(split[0])) {
					value = "%" + value.toString().trim() + "%";
				}
				if ("d".equalsIgnoreCase(split[0])) {
					value = format.format(value.toString().trim());
				}
			}
			mybatisParams.put(key, value);
		}

		return mybatisParams;
	}
}
