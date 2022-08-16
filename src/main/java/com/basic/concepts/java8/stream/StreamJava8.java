package com.basic.concepts.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava8 {

	public static void main(String[] args) {
		ArrayList<ObjectToSort> reportResults = new ArrayList<ObjectToSort>();
		int[] arr = { 9, 2, 3, 4, 5, 6, 7, 6, 5, 6, 8, 8, 9 };

		for (int i : arr) {
			ObjectToSort obj = new ObjectToSort();
			obj.setCorporateActionId(i);
			obj.setDate(new Date());
			obj.setName("id_" + i);
			reportResults.add(obj);
		}
		System.out.println("Original List");
		for (ObjectToSort i : reportResults) {
			System.out.println(i);
		}

		reportResults
				.sort((ObjectToSort a, ObjectToSort b) -> Long.valueOf(a.getCorporateActionId()).compareTo(b.getCorporateActionId()));

		System.out.println("After Sorting");
		for (ObjectToSort i : reportResults) {
			System.out.println(i);
		}

		System.out.println("After Filtering distinct :");
		List<Long> distinctList = reportResults.stream().map(e -> {
			return e.getCorporateActionId();
		}).distinct().collect(Collectors.toList());

		for (Long i : distinctList) {
			System.out.println(i);
		}
	}
}