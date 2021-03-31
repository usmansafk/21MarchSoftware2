package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Task1: ");
		
		int add = Calculator.add(5, 5);
		System.out.println(add);
		
		double multiply =  Calculator.multiply(5, 5); 
		System.out.println(multiply);
		
		int minus =  Calculator.minus(5, 5);
		System.out.println(minus);
		
		double divide =  Calculator.divide(5, 5); 
		System.out.println(divide);
		
		// //////////////////////////
		System.out.println();
		// //////////////////////////
		
		System.out.println("Task2: ");
		Results results =  new Results();
		
		results.method1(100, 85, 125); 
		results.method2();
		
	}
	
}



 
	




	
	/*
	
	
	hi();
	Hello.method1();
	
}


 public static void hi() {
		System.out.println("Hello World!");	
	}
	
	
	*/