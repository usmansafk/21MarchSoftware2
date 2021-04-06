package com.qa.day3;

import java.util.ArrayList;


public class Person {
	
	//instance variables
	private String name;
	private int age;
	private String jobTitle;
	
	
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String jobTitle() {
		return this.jobTitle;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	
	//constructor
	public Person(String name, int age, String title) {
		this.name = name;
		this.age = age;
		this.jobTitle  = title;
	}
	
	
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Title: "+ jobTitle;
		
	}
	

	
	
	
	
}


//Person Tasks
//Create a Person class modelling name, age and job title variables.

//Create a method to return all three of these in a formatted string.
//HINT: @Override the toString() method.

//Create some example objects with this class.

//Create a List<> implementation and store those objects inside.
//HINT: it's probably best to put your List<> implementation in a separate class.

//Create a method that can search for a specific Person by their name.

//Use a stream to output all of your people to the console.
//HINT: you can iterate through collections using streams with forEach().

//-----------------------------------------------------------------------------





