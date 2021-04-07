package com.qa.day4;

public class Runner {
//OOP
	
	public static void main(String[] args) {
		
		System.out.println("--------TASK1: Animals--------");
		
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
		
		System.out.println("--------TASK2: Vehicle --------");
		
		Car car1 = new Car("Audi R8", "Super Car", 4, 179);
		//car1.setName(");
		car1.go();
		car1.stop();
		
		Car car2 = new Car("Lambo", "Super Car", 4, 221);
		Car car3 = new Car("BMW", "Sports Car", 4, 149);
		
		
		
		
		
	
		Garage g = new Garage();
		g.addVehicle(car1);
		g.addVehicle(car2);
		g.addVehicle(car3);
		
		System.out.println(g.calcBill());
		
	
		
		
		
		
		
		
		
		
	
		
		
		
		

		
	}

}
