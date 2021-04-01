package com.qa.day1;

public class FizzBuzz {
	
	public static int FizzBuzz(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
				
		return n;
	}

}



/*
FizzBuzz
Create a method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
Return 'FizzBuzz' for numbers which are multiples of both three and five.
Return the input number for numbers that are neither.

*/