package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("a","b","c");
		Optional<String> result =  strings.stream().filter(s->s.compareTo("d")==0).findFirst();
		System.out.println("result : " + result.get());
	}

}
