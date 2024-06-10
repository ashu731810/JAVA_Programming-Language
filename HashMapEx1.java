package com.gorang;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<Integer, Integer> names = new TreeMap<>();
		names.put(4, 11);
		names.put(1, 22);
		names.put(3, 33);
		names.put(2, 44);
		names.put(5, 55);
		
		System.out.println(names);
		for(Map.Entry<Integer, Integer> entry : names.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		System.out.println("*****2nd type method use******");
		
		Set<Entry<Integer, Integer>> entries = names.entrySet();
		for(Map.Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}
}

