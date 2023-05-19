package com.concepts.hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapKeySet {

	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 11);
		map.put(2, 22);
		map.put(3, 33);
		
		Set<Integer> set = map.keySet();
		
		map.values();
		
		
		set.contains(1);
		
		set.forEach(e->{
			System.out.println(e);
		});
	}
}
