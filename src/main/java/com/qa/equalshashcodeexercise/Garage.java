package com.qa.equalshashcodeexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> garage = new ArrayList<Vehicle>();
	
	Vehicle vehicle1 = new Car(1234, "VW", "Golf", 1.6, "Car", 5,  0);
	
	//addVehicle(vehicle1);
	
	
	
	public void addVehicle(Vehicle vehicle) {
		
		garage.add(vehicle);
		
	}
	
	public void removeVehicle(String type) {
		
		for(Vehicle v : garage) {
			if(v.getType().equals(type)) {
				garage.remove(v);
			}
		}	
	}
	
	public void removeVehicle(int index) {
		
		for(Vehicle v : garage) {
			//TO-DO
		}	
	}
	
	public String fixAllVehicle() {
		int bill = 0;
		String vh = "";
		for(Vehicle v : garage) {
			if(v.getType().equals("Car")){	
				bill = 40;
				return vh = v.getMake() + v.getModel() + v.getType() + "Bill: " + bill;
			}
			
			if(v.getType().equals("Truck")){
				
				bill = 60;
				return vh = v.getMake() + v.getModel() + v.getType() + "Bill: " + bill;
			}
			
			
		}
		return vh;
			
	}
	
	public void emptyGarage() {
		//TO-DO
	}
	
	public int fixVehicle(int reg) {
			int bill = 0;
		for(Vehicle v : garage) {
			if(v.getReg() == reg && v.getType().equals("Car")) {
				int fixCarPrice = 40;
				bill = fixCarPrice * 3;
				garage.remove(v);
				return bill;
			}
			else if(v.getReg() == reg && v.getType().equals("Truck")) {
				int fixTruckPrice = 60;
				bill = fixTruckPrice * 5;
				garage.remove(v);
				return bill;
			}
			else if(v.getReg() == reg && v.getType().equals("Motorbike")) {
				int fixBikePrice = 20;
				bill = fixBikePrice * 2;
				garage.remove(v);
				return bill;
			}
		}
		return 0;

	}

}
