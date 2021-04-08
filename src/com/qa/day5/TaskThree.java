package com.qa.day5;

import java.util.Scanner;

public class TaskThree extends TaskTwo {

	public Scanner scanner = new Scanner(System.in);
	
	public TaskThree(String name, int age, String title) {
		super(name, age, title);
		
	}
	

	public void createPerson() {
		System.out.println("Enter Name of Person: ");
		String pName = scanner.nextLine();
		setName(pName);
		
		System.out.println("Enter Persons Age: ");
		int pAge = scanner.nextInt();
		scanner.nextLine();
		setAge(pAge);
		
		System.out.println("Enter Persons Job Title: ");
		String pJob =  scanner.nextLine();
		setJobTitle(pJob);
		
	}

}

//Person Extended With Menu
//Add a menu that prints options to the user for each of the following functionalities;
//	create person, output all people to console, and search for a specific person.
//Take user input from the menu and run the functionality they have chosen, taking user input where necessary.
//For example when the user wants to create a person, take user input for name, age, and job title.
