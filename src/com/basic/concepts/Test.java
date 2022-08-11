package com.basic.concepts;

public class Test {
	
	static int integer= 1;
	
	public static void main(String[] args) {
	
		// new keyword
		Cow cow = new Cow();
		
		int i = 0;
		
		if( 1==1) {
		
			int u = 0;
		}
		
		
		Long returnValue = cow.eat("grass");
		
		System.out.println("returnValue : " + returnValue + " class level variable : " + integer);
		
		Gir cow1 = new Gir();//inheritance
		
		cow1.eat("grass1s");
	}

}
