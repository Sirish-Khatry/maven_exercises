package com.qa.equalshashcodeexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {
	
	Vehicle vehicle;
	
	@Before
	public void init() {
		this.vehicle = new Vehicle();
	}
	
	@Test
	public void setReg() {
		
		//Give some resources 
		int expectedResult = 661122;
		
		//When action occurs
		this.vehicle.setReg(expectedResult);
		
		//Assert that the name was entered correctly
		int actualResult = this.vehicle.getReg();
		
		assertEquals(expectedResult, actualResult);		
		
	}
	
	@Test
	public void getRegTest() {
		
		//Give some resources 
		int expectedResult = 661122;
		Vehicle vehicle = new Vehicle(expectedResult, "VW", "Golf", 1.6, "Car");
		
		//When action occurs
		int actualResult = vehicle.getReg();
		
		//Assert that the name was set correctly
		assertEquals(expectedResult, actualResult);		
		
	}
	


}

