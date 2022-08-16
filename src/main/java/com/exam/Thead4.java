package com.exam;

import java.util.stream.Stream;

public class Thead4 {
	
	public static void main(String[] args) {
		//new Thead4().go();
		Stream.of(1,2,3,4,5,6,7).skip(5).forEach(num->System.out.println(num + " "));
	}
	public void go() {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("go");
				
			}
		};
		
		Thread t =  new Thread();
		t.start();
		t.start();
	}

}
