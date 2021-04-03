package com.qa.day1;

public class Taxes {
	
	//Method1
	public int taxPercentagePrint(int Salary) {

		int tax = 0;
		
		if(Salary < 14999) {
			System.out.println("Tax Percerntage: 0% tax");
		} else if(Salary >=15000 && Salary <=19999) {
			System.out.println("Tax Percerntage: 10% tax");
			tax = 10;
		} else if(Salary >= 20000 && Salary <=29999) {
			System.out.println("Tax Percerntage: 15% tax");
			tax = 15;
		} else if(Salary >= 30000 && Salary <=44999) {
			System.out.println("Tax Percerntage: 20% tax");
			tax = 20;
		} else if(Salary >=45000) {
			System.out.println("Tax Percerntage: 25% tax");
			tax = 25;
		}	
		//tip to self- start  of the  highest amount first then work your way down to improve code efficiency 
		
		return tax;
		
		
	}
	
	//Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. 
	//That amount should be returned and output to the console.
	public int taxPercentageCalculator(int Salary) {
		
		int taxedAmount = 0;
		int taxPercent = taxPercentagePrint(Salary);
	
		taxedAmount = Salary / 100 * taxPercent;
	
		System.out.print("Taxed Amount:" + taxedAmount);
		return taxedAmount;
	
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