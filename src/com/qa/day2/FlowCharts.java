package com.qa.day2;
//Iterations - Task 2 - FlowCharts 

public class FlowCharts {
	
	public static void flowchart1() {
		System.out.println("Flowcart 1:");
		for(int a=100; a<200; a++) {
			System.out.println("A");
		}
	}
	
	
	
	public static void flowcharts2() {
		System.out.println("Flowcart 2:");
		for (int a = 100; a <= 200; a++  ) {
			if (a%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
			
	}
	
	//Create a method that can print out the numbers 1-10 10 times each.
	public static void printNum1() {
		System.out.println("Flowchart 3:");
		for(int i = 1; i <=10 ; i++) {
			for(int j = 10; j>=1 ; j--) {
				System.out.println(i);
			}
		
		}	
	}
	
	
	
	//Create a method to print the numbers 1 to 10 as many times as the value of that number.
	//For example; you will print 1 once, and 10 ten times.

	public static void printNum2() {
		System.out.println("Flowchart 4:");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}	
	}
	
	//bonus nested loops practice...
	public static void multiplicationTable() {
		System.out.println("Multiplication Table:");
		for(int i = 1; i<= 10; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print((i*j) + " ");
			}
			System.out.println();
		}
		
	
	}
	
	
	

	
	
}


