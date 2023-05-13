package com.concepts.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapNullKey {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(null, 0);
		map.put(1, 1);
		
		map.entrySet().forEach(e -> {
			System.out.println(e);
		});
		
	}
}

