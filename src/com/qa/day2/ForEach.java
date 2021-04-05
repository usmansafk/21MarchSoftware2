package com.qa.day2;

public class ForEach {
	
	public static String[] cars = {"BMW", "Audi", "Lambo", "VW", "Merc" };
	public static int[] nums = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	public static void task1() {
		
		//for-each
		for(String i : cars) {
			System.out.println(i);
		}
		System.out.println();
		//for
		for(int i = 0; i< cars.length; i++) {
			System.out.println(cars[i]);
		}
	
	}
	
	
	public static void task2() {

		for(int i : nums) {
			int sqr = nums[i]*nums[i];
			System.out.println(sqr);
		}
	}
	
	
	public static boolean task3(int num) {
		
		if(num == num/2) {
			return true;
		} else return false;
		

	}
	
	
	public static void task4() {
		
		
		for(int i : nums) {
			if(nums[i]%2 == 0) {
				System.out.println(nums[i]*nums[i]*nums[i]);
			} else {
				System.out.println(nums[i]*nums[i]);
			}
		}
	}
	
}
	

//Using the array of integers from exercise 2 and the method created in exercise 3; 
//iterate through the array using an enhanced for loop, 
//calling the method from exercise 3 in the body.
//		>If the value is even, cube it, then print it to console.
//		>If the value is odd, square it, then print it to console.
	




//Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.

//Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.

//Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.





