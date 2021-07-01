package com.qa.equalshashcodeexercise;

public class Car extends Vehicle {
	
	private int totalCapacity;
	private int spareWheels;
	
	
	public Car(int reg, String make, String model, double engineSize, String type, int totalCapacity, int spareWheels) {
		super(reg, make, model, engineSize, type);
		this.totalCapacity = totalCapacity;
		this.spareWheels = spareWheels;
	}
	public int getTotalCapacity() {
		return totalCapacity;
	}
	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	public int getSpareWheels() {
		return spareWheels;
	}
	public void setSpareWheels(int spareWheels) {
		this.spareWheels = spareWheels;
	}
	
}
