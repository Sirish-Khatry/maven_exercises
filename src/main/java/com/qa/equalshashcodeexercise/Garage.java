package com.qa.equalshashcodeexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	 static List<Vehicle> garage = new ArrayList<Vehicle>();
	
	
	public static void main(String[] args) {
		
		
		Car vehicle1 = new Car(1234, "VW", "Golf", 1.6, "Car", 5,  0);
		Truck vehicle2 = new Truck(1234, "VW", "Golf", 1.6, "Truck", 200,  16);
		
		

		addVehicle(vehicle1);
		addVehicle(vehicle2);
		
		for(Vehicle a : garage) {
			if(a.getType() == "Car") {
				System.out.println(a.getReg()+ " " + a.getMake()+ " " + a.getModel() + " " + a.getType() + " " + ((Car) a).getTotalCapacity() + " " + ((Car) a).getSpareWheels());
			}
			if(a.getType() == "Truck") {
				System.out.println(a.getReg()+ " " + a.getMake()+ " " + a.getModel() + " " + a.getType() + " " + ((Truck) a).getMaxLoad() + " " + ((Truck) a).getWheels());
			}
		}
		
		removeVehicle("Car");	
		
		for(Vehicle a : garage) {
		System.out.println(a.getReg()+ " " + a.getMake()+ " " + a.getModel() + " " + a.getType());
		}
		
		System.out.println(fixAllVehicle());
		System.out.println(fixVehicle(1234));
		
	
	}
	
	public static void addVehicle(Vehicle vehicle) {
		
		garage.add(vehicle);
		
	}
	
	public static void removeVehicle(String type) {
		
		for(Vehicle v : garage) {
			if(v.getType() == type) {
				garage.remove(v);
			}
		}	
	}
	
	public void removeVehicle(int index) {
		
		for(Vehicle v : garage) {
			//TO-DO
		}	
	}
	
	public static String fixAllVehicle() {
		int bill = 0;
		String vh = "";
		for(Vehicle v : garage) {
			if(v.getType().equals("Car")){	
				bill = 40;
				return vh = v.getMake() + v.getModel() + v.getType() + " Bill: " + bill;
			}
			
			if(v.getType().equals("Truck")){
				
				bill = 60;
				return vh = v.getMake() + " " + v.getModel() + " " + v.getType() + " Bill: " + bill;
			}
			
			
		}
		return vh;
			
	}
	
	public void emptyGarage() {
		//TO-DO
	}
	
	public static String fixVehicle(int reg) {
			int bill = 0;
		for(Vehicle v : garage) {
			if(v.getReg() == reg && v.getType().equals("Car")) {
				int fixCarPrice = 40;
				bill = fixCarPrice * 3;
				garage.remove(v);
				return "Bill for your Car with Reg: " + v.getReg() + " is " + "£" + bill;
			}
			else if(v.getReg() == reg && v.getType().equals("Truck")) {
				int fixTruckPrice = 60;
				bill = fixTruckPrice * 5;
				garage.remove(v);
				return "Bill for your Truck with Reg: " + v.getReg() + " is " + "£" + bill;
			}
			else if(v.getReg() == reg && v.getType().equals("Motorbike")) {
				int fixBikePrice = 20;
				bill = fixBikePrice * 2;
				garage.remove(v);
				return "Bill for your Motorbike with Reg: " + v.getReg() + " is " + "£" +bill;
			}
		}
		return "Reg not found";

	}

}
