package com.qa.day1;

public class UniqueSum {
	
	public int uniquesum(int a, int b, int c) {
		
		int sum;
		
		if(a == b) return c;
		else if(a == c) return b;
		else if(b == c) return a;
		else
			sum = a + b + c;
		return sum;
		
	}
		
}

//if a == b then only print c
//if a == c then print b
//if b == c then print a
//else 
//int sum a + b + c;
//return sum;

//Given 3 integer values, return their sum. 
//If one value is the same as another value, they do not count towards the sum.
//In other words, only return the sum of unique numbers given.


