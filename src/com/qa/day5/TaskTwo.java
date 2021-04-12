package com.qa.day5;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskTwo {
	// instance variables
	protected String name;
	protected int age;
	protected String jobTitle;

	public Scanner scanner = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// constructor
	public TaskTwo(String name, int age, String title) {
		this.name = name;
		this.age = age;
		this.jobTitle = title;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Title: " + jobTitle;

	}

	private static ArrayList<TaskTwo> person = new ArrayList<TaskTwo>();

	public static void addHuman(TaskTwo p) {
		person.add(p);
	}

	// Search
	public static void searchPerson(String name) {
		for (TaskTwo p : person) {
			if (p.getName().equals(name)) {
				System.out.println("Found: " + p);

			}
			System.out.println("Missing");

			
		}

	}



}

/*
 * Person If you have already done this project in the Input and Output module,
 * move onto the Person Extended With Menu exercises.
 * 
 * Create a Person class that contains the following attributes:
 * 
 * Name Age Job Title Create a method to return all three of these attributes in
 * a formatted String. HINT: Override the toString() method.
 * 
 * Create some example objects with this class.
 * Create a List implementation and store those objects inside it.
 * 
 * Use a stream to output all of your people to the console.
 * Create a method that can search for a specific Person by their name.
 */

