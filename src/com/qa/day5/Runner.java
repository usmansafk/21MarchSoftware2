package com.qa.day5;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Scans.learnScanner();
		//TaskOne.calc();
		
		TaskTwo a = new TaskTwo("Bob", 25, "Builder");
		TaskTwo b = new TaskTwo("Sam", 19, "Student");
		TaskTwo c = new TaskTwo("Usman", 23, "Software Developer");
		

		//PersonManager manager = new PersonManager();
		TaskTwo.addHuman(a);
		TaskTwo.addHuman(b);
		TaskTwo.addHuman(c);
		
		
		TaskTwo.searchPerson("Usman");
	
		
		

	}

}
