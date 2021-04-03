package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		
		
		System.out.println("Basics: Hello World Example ");
		System.out.println("Hello World!");
		
		String text = "Hello World!";
		System.out.println(text);
		
		System.out.println(printYourNameMethod("Usman!"));
		
		System.out.println();
		
		
		System.out.println("Operators Task1: Calculator");
		int add = Calculator.add(5, 5);
		System.out.println(add);
		double multiply =  Calculator.multiply(5, 5); 
		System.out.println(multiply);
		int minus =  Calculator.minus(5, 5);
		System.out.println(minus);
		double divide =  Calculator.divide(5, 5); 
		System.out.println(divide);
		
		
		System.out.println();
		
		
		System.out.println("Operators Task2: Results");
		Results results =  new Results();
		results.method1(100, 85, 125); 
		results.method2();
		
		
		// /////////////////////////////////////////////////
		System.out.println();
		// /////////////////////////////////////////////////
		
		System.out.println("Conditionals Task1: Calculator Revisted");
		CalculatorRevisited.divide(10, 5);
		
		
		System.out.println();

		
		System.out.println("Conditionals Task2: Result Revisted");
		ResultsRevisted results2 = new ResultsRevisted();
		results2.method3(150, 160, 84);
		results2.method4();
		
		
		System.out.println();
		
		
		System.out.println("Conditionals Task3: Flow Charts");
		FlowCharts flow = new FlowCharts();
		System.out.println(flow.takes3(3, 5, false));
		
		flow.flowchart(2500);
		
		
		System.out.println();
		
		
		System.out.println("Conditionals Task4: BlackJacks");
		BlackJack blackjack = new BlackJack();
		System.out.println(blackjack.blackjacklol(19, 07));
		
		
		System.out.println();
		
		
		System.out.println("Conditionals Task5: UniqueSum");	
		UniqueSum uniquesum = new UniqueSum();
		System.out.println(uniquesum.uniquesum(3, 3, 5));
		System.out.println(uniquesum.uniquesum(5, 3, 5));
		System.out.println(uniquesum.uniquesum(1, 3, 5));
		
		
		System.out.println();
		
		
		System.out.println("Conditionals Task6: Taxes");	
		Taxes taxes = new Taxes();
		
		taxes.taxPercentagePrint(30000);
		taxes.taxPercentageCalculator(5000);
		
		System.out.println();
		System.out.println();

		
		System.out.println("Conditionals Task7: FizzBuzz");	
		FizzBuzz.FizzBuzz(100);
		
	}
	
	public static String printYourNameMethod(String name) {
		String sayHello = "Hello " + name;
		return sayHello;
	 }

	
}



/*
 
 Random----------------
 
Hello World Example//
Output "Hello World!" to the console.
Store "Hello World!" in a variable and then output it to the console.
Create a method that takes a String as a parameter, and then outputs it to the console.
Modify your method to return a String once called, which you then use to output to the console.




 		boolean bool1 = true;
		boolean bool2 = false;
		
		String str1 = "Hello ";
		String str2 = "Hello ";

		
		if (str1 == str2) {
			System.out.println("it matched");
		} else {
			System.out.println("str1 and str2 do not match");
		}
		
		if (bool1 && !bool2) {
			System.out.println("This works!");
		}
		
*/
