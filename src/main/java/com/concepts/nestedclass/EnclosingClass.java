package com.concepts.nestedclass;

public class EnclosingClass {

	private Integer marks = 10;
	public String name = "firstname.lastname";
	
	static Integer age = 32;
	
	
	public void someFunction() {};
	
	public class NestedNonStaticClass{
		
	}
	
	
	// The advantage of inner static class can be if there is a helper class B of a class A and the class B is 
	// just used in class A then it makes sense to create a static nested class within class A.
	
	public static class NestedStaticClass{
		
	}
	
	public static void main(String[] args) {
		
		EnclosingClass enclosingClass = new EnclosingClass();
		// will be accessed by an instance of the enclosing class
		NestedNonStaticClass nestedNonStaticClassInstance =
				enclosingClass.new NestedNonStaticClass(); 
		
		// inner static class does not need an instance of the enclosing class to be created.
		NestedStaticClass nestedStaticClass = new NestedStaticClass();
		
	}
}
