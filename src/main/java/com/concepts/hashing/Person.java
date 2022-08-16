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

	public int hashCode() {
		return 420;
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
		
	}
}
