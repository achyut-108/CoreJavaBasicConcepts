package com.arraylist.concepts;

import java.util.Arrays;
import java.util.List;

public class TestSubList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1);

		List<Integer> subList = list.subList(0, 1);

		System.out.println("Testing sublist");
		for (Integer integer : subList) {
			System.out.println(integer);
		}
	}
}
