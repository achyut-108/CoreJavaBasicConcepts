package com.concepts.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapIterator {
	
	public static void main(String[] args) {
	
		HashMap<Integer, Integer> hashMap = (HashMap<Integer, Integer>) Arrays.asList(1,2,3,4,5,6,7).stream().
				collect(Collectors.toMap(e -> e, e -> e));
		
		Iterator<Entry<Integer, Integer>> entrySetIterator = hashMap.entrySet().iterator();
		
		while(entrySetIterator.hasNext()) {
			Entry<Integer, Integer> entry = entrySetIterator.next();
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
		
		//Stream<List<Integer>> streaMInteger = Stream.of(Arrays.asList(1,2,3,4,5));
		
	}
	

}
