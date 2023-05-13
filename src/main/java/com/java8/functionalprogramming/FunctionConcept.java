package com.java8.functionalprogramming;

import java.util.function.Function;

public class FunctionConcept {

	public static void main(String[] args) {
		
		// receives input and gives output
		Function<String, Integer> stringToIntegerFunc = str -> Integer.parseInt(str);
		
		Integer result = stringToIntegerFunc.apply("5");
		System.out.println(result);
	}
}
