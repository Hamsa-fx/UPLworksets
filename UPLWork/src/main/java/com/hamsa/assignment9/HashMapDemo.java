package com.hamsa.assignment9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Double> hashMap = new HashMap<String,Double>();
		hashMap.put("Rohit", 3434.34);
		hashMap.put("Mohit", 123.22);
		hashMap.put("Ashish", 1200.34);
		hashMap.put("Khariwal", 99.34);
		hashMap.put("Pankaj", -19.34);
		Set set = hashMap.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) i.next();
			System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		}
		// deposit into Rohit's Account
		double balance = ((Double) hashMap.get("Rohit")).doubleValue();
		hashMap.put("Rohit", balance + 1000);
		System.out.println("\n Rohit's new balance : " + hashMap.get("Rohit"));
	}

}
