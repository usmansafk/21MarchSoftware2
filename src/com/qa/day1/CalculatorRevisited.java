package com.qa.day1;

//Conditional Exercise - Task 1: Calculator Revisited
public class CalculatorRevisited {
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public static int minus(int num1, int num2) {
		int  result = num1 - num2;
		return result;
	}
	
	public static void divide(int num1, int num2) {
		if(num1 < num2) {
			int result = num1 / num2;
			System.out.println(result);
		} else {
			System.out.println("The division cannot be performed");
		}
	} 
}


/*

Edit the division method in the Calculator class,
the sum should only execute if the first parameter is smaller than the second, 
otherwise it prints out a message saying that the division cannot be performed.
*/