package com.tapan.dsa.hashMap;

import java.util.HashMap;
import java.util.Map;

public class ConceptBuilding {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 3, "B", 2, "T", 11);
		System.out.println(map);
		System.out.println(map.get("T"));
		System.out.println(map.containsKey("T"));
		System.out.println(map.containsValue(2));
		System.out.println(map.keySet());
		System.out.println(map.values());

		Map<String, Integer> hashmap = new HashMap<String, Integer>(map);
		System.out.println(hashmap);
		hashmap.put("K", 56);
		System.out.println(hashmap);
	}

}
