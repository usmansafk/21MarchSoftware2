package com.qa.day4;

public class Bus extends Vehicle {

	private int size;
	
	public Bus(String name, String type, int wheels, int speed, int size) {
		super(name, type, wheels, speed);
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	@Override
	public void go() {
		double speed = (int)(Math.random()*100); 
		System.out.println(speed);
		if(speed >= 75) {
			System.out.println("The car is driving really fast at " + speed + "mph");
		} else if (speed <=75) {
			System.out.println("The car is driving slowly " + speed + "mph");
		}
		
	}

	public void stop() {
		System.out.println("The vehicle has stopped");
	}

	
	@Override
	public float calculateBill() {
		float bill = (int) Math.random()*1000;
		return bill;
	}
	

}
