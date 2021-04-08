package com.qa.day5;

import java.util.Scanner;

public class TaskOne {

	static Scanner scanner = new Scanner(System.in);

	private static int num1 = 0;
	private static int num2 = 0;
	private static String operator = " ";

	final static int add(int num1, int num2) {
		return num1 + num2;
	}

	final static public int minus(int num1, int num2) {
		return num1 - num2;

	}

	final static public int multiply(int num1, int num2) {
		return num1 * num2;

	}

	final static public int divsion(int num1, int num2) {
		return num1 / num2;
	}

	public static void calc() {
		System.out.println("Please enter your first number: ");
		num1 = scanner.nextInt();
		System.out.println("Please enter your second number: ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please select your operator + - * /");
		operator = scanner.nextLine();

		switch (operator) {
		case "+":
			System.out.println("Your answer is: " + add(num1, num2));
			break;
		case "-":
			System.out.println("Your answer is: " + minus(num1, num2));
			break;
		case "*":
			System.out.println("Your answer is: " + multiply(num1, num2));
			break;
		case "/":
			System.out.println("Your answer is: " + divsion(num1, num2));
			break;

		default:
			System.out.println("Please select one of the following operators: + - * /");
			scanner.nextLine();

		}

		scanner.close();

	}

}

//Exercises

//Calculator
//Create a project that has four methods; addition, subtraction, multiplication, and division.
//All of these methods should take two numbers as parameters.
//Create a method to ask the user which of the four methods they wish to use,
//then take the numbers as user input for the operation and output the result back to the user.
