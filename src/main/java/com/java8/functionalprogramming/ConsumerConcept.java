package com.java8.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerConcept {
	
	public static void main(String[] args) {
		
		// Consumer only accepts a input and does the operation it is destined to and
		// does not return anything
		Consumer<Integer> customConsumer = d -> System.out.println(d);
		
		customConsumer.accept(5);
	}

}
