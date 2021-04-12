package com.qa.Exception;

public class First {

	public static void main(String[] args) {

		int result = 0;
		int[] numbers = { 34, 56 };

		try {
			result = 4 / 3;
			System.out.println(numbers[3]);

		} catch (ArithmeticException X) {
			System.out.println("You cant drive a number with zero");
		} catch (ArrayIndexOutOfBoundsException Y) {
			System.out.println("This index is not in the array");
		}

		System.out.println("The result: " + result);
		System.out.println("Good-Bye");
		
		System.out.println();
		
		System.out.println("Task 2:");
		HSBC bank = new HSBC();
		bank.SalarySlip(4000, 14);
		

	}

}
