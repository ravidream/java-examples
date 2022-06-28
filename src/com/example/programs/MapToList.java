package com.example.programs;

import java.util.*;

class MapToList {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(6, "f");

		List<Integer> keyList = new ArrayList(map.keySet());
		List<Integer> valueList = new ArrayList(map.values());

		System.out.println("Key List : " + keyList);
		System.out.println("value List : " + valueList);
	}
}