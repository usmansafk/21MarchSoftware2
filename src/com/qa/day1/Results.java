package com.qa.day1;

//Operators Exercise - Task 2: Result
public class Results {
	
	int physics = 150;
	int chemsitry  = 150;
	int biology  = 150;
	int total;
	double percentage;
	
	//Method 1 - displays the results that the person got for each exam and then the total mark. 
	//Try to make the output neat and be spoke for each exam.
	public void method1(int test1, int test2, int test3) {
		
		total = test1 + test2 +  test3;
		System.out.println("Physhics Mark: " + test1);
		System.out.println("Chemistry Mark: " + test2);
		System.out.println("Bioilogy Mark: " + test3);
		System.out.println("Total Mark: " + total );
	}
	
	//Method 2 - which finds and displays the percentage that the person received for the exams overall.
	public void method2() {
		
		percentage =  total * 100 / 450;
		System.out.println("Overall Percentage: " + percentage  +"%");
	
	}
	
}















