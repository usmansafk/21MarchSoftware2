package com.qa.day3;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> people = new ArrayList<Person>();
	
	public void addHuman(Person p) {
		this.people.add(p);
	}
	
	
	//Search
	public void searchPerson(String name) {
		for(Person p : people) {
			if(p.getName().equals(name)) {
				System.out.println("Found: " + p);
				
			}
			System.out.println("Unable to locate person.");
		}
	
	}
}
