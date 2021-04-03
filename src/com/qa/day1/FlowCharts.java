package com.qa.day1;
//Conditionals Task3
public class FlowCharts {
	
	int result; 
	
	public int takes3(int a, int b, boolean c) {
		
		if(c) {
			result = a+b;
		} else {
			result = a*b;
		}
		return result;
		
		//if c= true, a + b
		//if c= false = a*b
	}
	
	
	public void flowchart(int A) {
		if(A>2000) {
			System.out.println("A");
			if(A>6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if(A>4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
			
		} else {
			System.out.println(1);
			if(A<100) {
				System.out.println(2);
			} else {
				System.out.println(3);
				if(A>600) {
					System.out.println(5);
				} else {
					System.out.println(4);
					if(A>500) {
						System.out.println(6);
					} else { 
						System.out.println(7);
					}
				}
			} 
		}
	}
//	Create a method that takes a single integer A as a parameter.
//	First evaluate if A is greater than 2000. If true, print "1", if false, print "A"

	

}



/*

Flowcharts:

 1/
Create a method which accepts 3 parameters, 2 integers and a boolean.

If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
For example:

Input (1, 2, true) -> 3
Input (3, 3, false) -> 9
Input (1, 1, true) -> 2


2/
Recreate the the flowchart image as a project. See QA.




*/