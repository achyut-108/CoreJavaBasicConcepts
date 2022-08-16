package com.basic.concepts.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {

		try {
			
			Class<?> reflectionClass = Class.forName("com.basic.concepts.reflection.ReflectionClass");
			
			System.out.println(reflectionClass);//18

			// Class<? extends Enum> reflectionEnum = Class.forName("ReflectionEnum");
			
			Class<?> enumClass = Class.forName("com.basic.concepts.reflection.ReflectionEnum");
			
			if(enumClass instanceof Class && ((Class<?>)enumClass).isEnum()) {
				System.out.println("is enum type...");
			}

			System.out.println( "Enum ... " + Enum.valueOf((Class<? extends Enum>) Class.forName("com.basic.concepts.reflection.ReflectionEnum"), "ALL"));

			// Enum.valueOf( reflectionEnum.getClass(), "ALL");
			
			Class reflectionClassNewInstance = (enumClass.getClass()) reflectionClass.newInstance();

			Method setterMethod = reflectionClassNewInstance.getMethod("setReflectionEnum", enumClass);
			setterMethod.invoke(reflectionClassNewInstance, Enum.valueOf((Class<? extends Enum>) enumClass, "ALL"));

			System.out.println(reflectionClass);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
