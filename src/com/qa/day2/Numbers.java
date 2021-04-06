package com.qa.day2;
//Iterations - Task 2 - Numbers 
//TBC......
public class Numbers {
	
	public static int addTwoNums(int num) {
		int val = 0;
		while (num >= 10 && num <= 99) {// 11
			num = num - 10;// 1
			val++;// 1
		}
		while (num >= 1 && num <= 9) {
			num = num - 1;// 0
			val++;// 1+1
		}
		return val;// 2
	}
	

	
}
	




/*
 Numbers
1. Create a method that takes a number 10-99, 
and adds the two digits together for example 74 = 7 + 4 = 11.

2. 
Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
Expand on the method you wrote in Numbers 2 to allow the input 1-999.
Expand the method you wrote in Numbers 2 to allow the input 1-9999.


 */



