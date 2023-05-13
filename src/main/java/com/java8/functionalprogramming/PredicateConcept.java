package com.java8.functionalprogramming;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

public class PredicateConcept {
	
	public static void main(String[] args) {
		
		// gives a boolean result
		Predicate<String> checkLength = str -> str.length() > 3;
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Hare");
		stringList.add("Krishna");
		stringList.add("Ram");
		
		List<String> resultList = stringList.stream().filter(CustomPredicateClass.checkLengthPredicate()).collect(Collectors.toList());
		
		resultList.forEach(System.out::println);
		
		resultList = resultList.stream().filter(checkLength).collect(Collectors.toList());
		resultList.forEach(System.out::println);
	}

}
