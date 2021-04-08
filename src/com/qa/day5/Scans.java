package com.qa.day5;

import java.util.Scanner;

public class Scans {

	public static void learnScanner() {

		Scanner scanner = new Scanner(System.in);
		boolean catchError = false;
		System.out.println("Hello");
		int number = 0;

		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();

		do {
			System.out.println("Please enter your age");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				catchError = true;
			} else {
				scanner.nextLine();
				System.out.println("Thats not a number. Try Again.");
			}
		} while (!catchError);
		
	
		scanner.nextLine();
		System.out.println("Tell me your superpower: " + name);
		String fact = scanner.nextLine();

		System.out.println("Welcome, " + name);
		System.out.println("You are: " + number);
		System.out.println("Superpower: " + fact);


	}

}
