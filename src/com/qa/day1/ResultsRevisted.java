package com.qa.day1;

//Conditional Exercise - Task 2: Results Revisited
public class ResultsRevisted {
	

	int physics = 150;
	int chemsitry  = 150;
	int biology  = 150;
	static int total;
	static double percentage = (60/100) * 150;
	double passmark;
	
	String[] classes = {"Physics", "chemistry", "Biology"};
	
			
			

//Method 3 - displays the results that the person got for each exam and then the total mark. 
//Try to make the output neat and be spoke for each exam.
	public void method3(int test1, int test2, int test3) {
		
		
		
			
		System.out.print("Physhics Mark: " + test1);
		if (test1<percentage) {
			System.out.println("(Failed)");
		} else {
			System.out.println("(Passed)");
		}
			
		System.out.print("Chemistry Mark: " + test2);
		if (test2<percentage) {
			System.out.println("(Failed)");
		} else {
			System.out.println("(Passed)");
		}
			
		System.out.print("Bioilogy Mark: " + test3);
		if (test3<percentage) {
			System.out.println("(Failed)");
		} else {
		System.out.println("(Passed)");
		}
				
		total = test1 + test2 +  test3;
			System.out.println("Total Mark: " + total );
				
		}
			
			
//Method 4 - which finds and displays the percentage that the person received for the exams overall.
	public void method4() {
		
				
		double studentPercentage =  total * 100 / 450;
		System.out.print("Overall Percentage: " + studentPercentage  +"%");
				
		if (studentPercentage < percentage) {
			System.out.println("(Failed)");
		} else {
			System.out.println("(Passed)");
		}
			
	}
}
	



	/*


	Results Revisited
	Expand the Results class so that there is now a pass mark of 60%; 
	if the person receives under 60% they get a fail message.

	Expand the previous example so that even if the person gets higher than 60% overall, 
	if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.

	eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84

	they would have an overall grade of 85.3% (Pass)

	but in this case the student would fail because their physics grade is 54% (Fail)

	Expand the above so that the message that is displayed varies depending on
	the number of subjects that they have failed.

	*/


