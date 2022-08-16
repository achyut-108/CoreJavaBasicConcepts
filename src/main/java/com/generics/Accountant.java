package com.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Accountant extends Employee{

	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future result = es.submit(()->1);
		List<Employee> list = new ArrayList<Accountant>();
		
	}
}
