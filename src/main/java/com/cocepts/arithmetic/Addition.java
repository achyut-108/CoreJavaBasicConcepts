package com.cocepts.arithmetic;

public class Addition implements Sum{


	public static void main(String[] args) {
		
		int s = 5;
		
		new Addition().getInt(++s);
		
	}

	public void getInt(int s) {
		// TODO Auto-generated method stub
		
		s += HOME + ++s;
		
		System.out.println(s + " " + s);
	}
}
