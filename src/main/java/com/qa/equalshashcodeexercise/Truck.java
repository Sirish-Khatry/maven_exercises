package com.qa.equalshashcodeexercise;

public class Truck extends Vehicle{
	private int maxLoad;
	private int wheels;
	
	public Truck(int reg, String make, String model, double engineSize, String type, int maxLoad, int wheels) {
		super(reg, make, model, engineSize, type);
		this.maxLoad = maxLoad;
		this.wheels = wheels;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
	
}
