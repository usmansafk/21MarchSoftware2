package com.qa.day3;

import java.util.ArrayList;

import com.qa.day2.StringManipulation;

public class Runner {

	public static void main(String[] args) {
		
		
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Constructor Practice Exercise: ");
		Person a = new Person("Bob", 25, "Builder");
		Person b = new Person("Sam", 19, "Student");
		Person c = new Person("Usman", 23, "Software Developer");
		
		System.out.println(a);
		
	
		PersonManager manager = new PersonManager();
		manager.addHuman(a);
		manager.addHuman(b);
		manager.addHuman(c);
		
		
		manager.searchPerson("Bob");
		
		

		
		
		
	}
}




