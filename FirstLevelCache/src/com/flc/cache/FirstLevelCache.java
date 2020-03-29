
package com.flc.cache;

import java.util.Map;

public class FirstLevelCache {
	private static FirstLevelCache instance;
	private Map<String, Object> dataMap;

	public FirstLevelCache() {
	}

	public static FirstLevelCache getInstance() {
		if (instance == null) {
			instance = new FirstLevelCache();
		}
		return instance;
	}

	public void put(String key, Object value) {
		dataMap.getOrDefault(key, value);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containKey(String key) {
		return dataMap.containsKey(key);
	}
}
