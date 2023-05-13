package com.string.concepts;

public class StringPoolConcept {
	
	
	public static void main(String[] args) {
		
		String s1 = "Radha";
		String s2 = "Radha";
		System.out.println("s1 equals s2 : " + (s1 == s2)); //true
		String s3 = new String("Radha");
		// creates the string literal in the string pool or
		// if already existing in the string pool then just references there.
		String s4 = s3.intern(); 
		s3 = null;
		System.out.println("s1 equals s3 : " + (s1 == s3)); //false
		System.out.println("s1 equals s4 : " + (s2 == s4)); // true
		
		String s5 = new String(s1);
		System.out.println("s1 equals s5 : " + (s1 == s5));//false
	}

}
