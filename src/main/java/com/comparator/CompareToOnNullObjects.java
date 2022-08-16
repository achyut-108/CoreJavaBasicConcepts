package com.comparator;

public class CompareToOnNullObjects {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = "s2";

		System.out.println(compareIpAccountRoleRuleDates(s1, s2));

	}

	private static boolean compareIpAccountRoleRuleDates(String string1, String string2) {
		boolean stringMatch = false;

		if (string1 == null && string2 == null) {
			stringMatch = true;
		}

		if (string1 != null) {
			if (string2 == null)
				stringMatch = false;
			else
				stringMatch = (string1.compareTo(string2) == 0);
		}

		return stringMatch;
	}
}
