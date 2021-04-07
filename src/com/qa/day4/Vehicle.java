package com.qa.day4;

public abstract class Vehicle {
	protected String name;
	protected String type;
	protected int numOfWheels;
	protected int topSpeed;
	
	
	public Vehicle(String name, String type, int wheels, int speed) {
		super();
		this.name = name;
		this.type = type;
		this.numOfWheels = wheels;
		this.topSpeed = speed;
		System.out.println(toString());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	

	public String toString() {
		return this.name + "\n" + "Class: " + this.type + "\n" + "Top speed: " +this.topSpeed;
	}
	
	
	//abstract method
	public abstract float calculateBill(); 
	
	public void go() {
		double speed = (int)(Math.random()*100); 
		System.out.println("The vehicle is moving at " + speed);
	}
	
	public void stop() {
		System.out.println("The vehicle has stopped");
	}
	
	
	
	
	

}
//Using Vehicle as a base class, create three derived classes 
//(car, motorcycle etc.),
//each derived class should have its own attributes in addition 
//to the normal Vehicle attributes.