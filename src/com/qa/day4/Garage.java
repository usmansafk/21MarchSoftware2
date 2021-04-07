package com.qa.day4;

import java.util.*;

public class Garage {
	
	private List<Vehicle> vehicle = new ArrayList<>();
	
	//add vehicles
	public boolean addVehicle(Vehicle v) {
		return this.vehicle.add(v);
	}
	//remove vehicles
	public boolean rmVehicle(Vehicle v) {
		return this.vehicle.remove(v);
	}
	
	//empty garage
	public void emptyGarage() {
		this.vehicle.clear();
	}
	
	//traverse list 
	public void printVehicles() {
		for(Vehicle x : vehicle) {
			System.out.println(x.name);
		}
	}
	
	//calc bill
	public float calcBill() {
		float bill = 0f;
		for(Vehicle v : vehicle) {
			bill += v.calculateBill();
		}
		
		return bill;
		
	}
		
	
	
	
		
		
		
	
	
	
	
}
