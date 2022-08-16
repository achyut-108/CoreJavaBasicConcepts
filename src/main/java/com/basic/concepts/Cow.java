package com.basic.concepts;

import java.math.BigInteger;

//super class //parent class
public class Cow {

	// access modifer -- > public,private protected,default
	protected void run() {

	}

	public Long eat(String s) {

		System.out.println("The paratmeter passed is : " + s);
		
		return 1L;
	}
	
	public static void main(String[] args) {
		System.out.println("Interger hingest value : " + Integer.MAX_VALUE);
		System.out.println(" long higher value : " + Long.MAX_VALUE);
		//BigInteger 
	}

}
