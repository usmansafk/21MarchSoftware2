package com.qa.day1;

public class Taxes {
	
	//method1
	public String taxPercentage(int Salary) {
	String taxPercerntage =  " ";
	
		if(Salary < 14999) {
			taxPercerntage =  "0% tax";
		} else if(Salary >15000 && Salary <19999) {
			taxPercerntage =  "10% tax";
		} else if(Salary >20000 && Salary <29999) {
			taxPercerntage =  "15% tax";
		} else if(Salary >30000 && Salary <44999) {
			taxPercerntage =  "20% tax";
		} else if(Salary >45000) {
			taxPercerntage =  "25% tax";
		}
		
		return taxPercerntage;
		
		
		
//		The salaries are taxed as below:
//					0 - 14,999 : 0% tax
//					15,000 - 19,999 : 10% tax
//					20,000 - 29,999 : 15% tax
//					30,000 - 44,999 : 20% tax
//					45,000+ : 25% tax
		
	}
	
	
	
}





/*


Taxes: 

1.

Create the tax class, it contains 2 methods.

Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.

Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.

These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*


2. 

The salaries are taxed as below:

0 - 14,999 : 0% tax
15,000 - 19,999 : 10% tax
20,000 - 29,999 : 15% tax
30,000 - 44,999 : 20% tax
45,000+ : 25% tax



3.

Finally combine the 2 methods so that the second method utilises the first method to return the correct result.



*/