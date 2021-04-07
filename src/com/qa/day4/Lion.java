package com.qa.day4;

public class Lion extends Animal{
	
	private int age;

	public Lion(String name, int size, boolean hungry) {
		super(name, size, hungry);
		this.age = age;
	
	}

	public void lionRank() {
		if(size>100) {
			System.out.println("This Lion is the King of the Jungle");
		} else if (size<25){
			System.out.println("This Lion is a cub");
		}
	}
	
	@Override
	public void eat() {
		System.out.println("The lion is eating its prey.");
	}
	
	public void isHunting() {
		System.out.println("The lion is hunting for its food!");
		this.eat();
	}
	
	
	@Override
	public void makingSound() {
		System.out.println("RAWR!");
	}
	
	

}
