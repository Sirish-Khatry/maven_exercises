package com.qa.equalshashcodeexercise;

public class Vehicle {
	
	private String make;
	private String model;
	private double engineSize;
	private String type;
	private int reg;
	
	
	public Vehicle(int reg, String make, String model, double engineSize, String type) {
		super();
		this.reg = reg;
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;

		this.type = type;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	
}
