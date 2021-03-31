package com.qa.day1;

//Task1
public class OperatorsExercises {
	

	public static void sum(int a, int b) {
		int sum = a + b;
		 System.out.println(sum);
	}
	
	public static void mult(int a, int b) {
		int mult = a * b;
		 System.out.println(mult);
	}
	
	public static void minus(int a, int b) {
		int minus = a - b;
		 System.out.println(minus);
	}
	
	public static void div(double a, double b) {
		double div = a * b;
		 System.out.println(div);
	}


	

}





/*
 
Calculator
Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)

Create the following additional three methods that each take two parameters:

Multiplication - which takes two numbers and returns the product.
Subtraction - which takes two numbers, then returns the result of the subtraction.
Division - which takes two numbers, then returns the result of the division.
Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.


 
 */
