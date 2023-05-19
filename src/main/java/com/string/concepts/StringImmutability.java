package com.string.concepts;

public class StringImmutability {

	public static void main(String[] args) {
		
		String one = "abcd";
		String two = "abc";
		
		System.out.println("two : " + two);
		
		String three = one.substring(0,one.length()); // the java implementation returns the same string
		// if the substring length is same as that the original String.
		
		System.out.println("three : " + three); // abcd
		
		String four = one.substring(0,one.length()-1);
		four = four.intern();
		
		System.out.println("four : " + four); // abc
		
		
		//one == three (true) two==four(false)
		System.out.print((one == three) +"-"+ (two == four));
		
	}
	
}
