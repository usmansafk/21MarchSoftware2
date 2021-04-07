package com.qa.day4;

public class Car extends Vehicle{
	
	private int year;
	private String model;
	private boolean isElectric;
	
	public Car(String name, String type, int wheels, int speed) {
		super(name, type, wheels, speed);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
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
		float bill = (int) Math.random()*100;
		return bill;
	}

	
	
}
