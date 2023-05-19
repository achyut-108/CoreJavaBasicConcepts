package com.concepts.hashing;

import java.util.HashMap;

public class HashCodeConcept {

	static final int hash(Object key) {
        int h;
         
        System.out.println("  key.hashCode : " + key.hashCode());
        
        System.out.println("right shift : " + (key.hashCode() >>> 16));
        
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Siddhartha");
		
		//hash(person1);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("131073 >>> 16 " + (131073 >>> 16));
		
		System.out.println("Without right shift : " + (131073 % 32));
		System.out.println("right shift : " + (131073 ^ (131073 >>> 16)) % 32);
		
	}
	
	 
}
