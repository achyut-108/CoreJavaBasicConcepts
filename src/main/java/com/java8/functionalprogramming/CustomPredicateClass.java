package com.java8.functionalprogramming;

import java.util.function.Predicate;

public class CustomPredicateClass {

	public static Predicate<String> checkLengthPredicate(){
		return str -> str.length() > 2;
	}
	
}
