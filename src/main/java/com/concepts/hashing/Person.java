package com.concepts.hashing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {
		
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		Person p1  = new Person("p1");
		map.put(p1, 1);
		Person p2  = new Person("p2");
		map.put(p2, 2);
		System.out.println(map.get(p1));
		map.remove(p1);
		System.out.println(map.get(p2));
		
		HashMap<String, String> props = new HashMap<String, String>();
		props.put("key45", "someValue");
		props.put("key12", "otherValue");
		props.put("key39", "someOtherValue");
		Set s = props.keySet();
		s = new TreeSet<String>(s);
		
		
		//test null key in hash map
		System.out.println("Testing if we can get a object using Null key in hashmap start ");
		testNullKeyInHashMap();
		assert(testNullKeyInHashMap());
		System.out.println("Testing Null key in hashmap end ");
	}
	
	
	public static boolean testNullKeyInHashMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, 4);
		
		
		System.out.println(map.get(null));
		
		return map.get(null) != null;
	}
}
