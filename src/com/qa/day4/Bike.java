package com.qa.day4;

public class Bike extends Vehicle {
	
	private int numOfWheels = 2;
	
	
	public Bike(String name, String type, int wheels, int speed) {
		super(name, type, wheels, speed);
		
	}


	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	
	
	@Override
	public void go() {
		double speed = (int)(Math.random()*100); 
		System.out.println(speed);
		if(speed >= 75) {
			System.out.println("The bike is driving really fast at " + speed + "mph");
		} else if (speed <=75) {
			System.out.println("The bike is driving slowly " + speed + "mph");
		}
		
	}

	public void stop() {
		System.out.println("The vehicle has stopped");
	}

	
	@Override
	public float calculateBill() {
		float bill = (int) Math.random()*100;
		return bill;
	}
	
	

}
