package com.basic.concepts;

public class Test {
	
	public static void main(String[] args) {
	
		// new keyword
		Cow cow = new Cow();
		
		Long returnValue = cow.eat("grass");
		
		System.out.println("returnValue : " + returnValue);
		
		Gir cow1 = new Gir();//inheritance
		
		cow1.eat("grass1s");
	}

}
