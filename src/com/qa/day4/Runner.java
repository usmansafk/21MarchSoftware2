package com.qa.day4;

public class Runner {
//OOP
	
	public static void main(String[] args) {
		
		Lion lion = new Lion("Lion", 42, true);
		Lion babyLion = new Lion("Cub", 12, false);
		Monkey monkey = new Monkey("Monkey", 18, true);
		Cow cow = new Cow("Cow", 30, true);
		
		
		System.out.println(lion.getAnimalName() + ":");
		lion.makingSound();
		lion.isHunting();
		lion.size = 156;
	
		System.out.println();
		
		System.out.println(babyLion.getAnimalName()+ ":");
		babyLion.size = 8;
		babyLion.lionRank();
		
		System.out.println();
		
		monkey.eat();
		cow.eat();
		
		
		
		
	
		
		
		
		

		
	}

}
