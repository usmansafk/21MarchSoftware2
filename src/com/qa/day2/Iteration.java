package com.qa.day2;

public class Iteration {
	
	public static void forLoop(int inp) {
		System.out.println("For Loop:");
		for (int count = 0; count <= 10; count++) {
			int times  = inp * count;
			System.out.println(inp + " * " + count + " = " + times);
			
		}
	}
	
	
	public static void whileLoop(String a) {
		System.out.println("While Loop:");
		
		while(a == "Cust") {
			System.out.println("Customer CRUD");
			forLoop(3);
			a = "Exit";
		}
	}
	
	
	public static void doWhileLoop() {
		System.out.println("Do-While Loop:"); // this runs it at least once!
		int val = 1;
		
		do {
			val++;
			System.out.println(val);
		} while(val<3);
		
	}
	
	
	
	
	

}
