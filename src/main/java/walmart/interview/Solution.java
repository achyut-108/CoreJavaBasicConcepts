package walmart.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
	
		Integer mod = 1000000007;
		
		System.out.println("mod is : " + mod);
		
		System.out.println("result : " + (59 % mod));
		
		List<Integer> list = new ArrayList<Integer>(9);
		list.set(8, -1);
		Stack<Integer> s = new Stack<Integer>();
		
		for(Integer integer : list) {
			System.out.println("integer : " + integer);
		}
		//System.out.println("at 8th postion : " + list.get(8));
		
		
	}
}
