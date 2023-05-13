package com.java8.functionalprogramming;

import java.util.function.Supplier;

public class SupplierConecpt {
	
	public static void main(String[] args) {
		
		// Supplier just supplies a output without any input
		Supplier<Integer> customSupplier = () -> 5;
		
		Integer result = customSupplier.get();
		System.out.println(result);
		
		
	}

}
