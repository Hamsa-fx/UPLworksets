package com.hamsa.learning.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("IND", "INDIA");
		countryMap.put("CHN", "CHINA");
		countryMap.put("USA", "UNITED STATE OF AMERICA");
		countryMap.put("JPN", "JAPAN");
		countryMap.put("SRI", "SRILANKA");

		System.out.println("Display using iterator");
		Iterator iter = countryMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, String> item = (Entry<String, String>) iter.next();
			System.out.println(item.getKey() + "::" + item.getValue());

		}
		System.out.println("Display using Map");
		for (Map.Entry<String, String> item : countryMap.entrySet()) {
			System.out.println(item.getKey() + "::" + item.getValue());
		}
		System.out.println("Display using lambda expression");
		countryMap.forEach((key, val) -> System.out.println(key + "::" + val));
	}

}
