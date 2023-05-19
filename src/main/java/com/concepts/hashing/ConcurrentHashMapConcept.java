package com.concepts.hashing;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapConcept {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new ConcurrentHashMap();
		
		Map<Integer, Integer> mapConcurrencyLevel = new ConcurrentHashMap(16,0.75f,32);
		
		
		System.out.println(1 << 30);
		
	}
	
	
}
