package com.javaclassloading;

public class ClassLoadingTest {
	
	public static void main(String[] args) {
		
		ClassLoadingTest clt = new ClassLoadingTest();
		System.out.println("class loader : " + clt.getClass().getClassLoader());
		char c = 'i';
		System.out.println((int)c);
		String s = "s";
		s.toCharArray();
		
	}
	

}
