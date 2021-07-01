package com.qa.equalshashcodeexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	
	
	Animal animal;
	
	@Before
	public void init() {
		this.animal = new Animal();
	}
	
	@Test
	public void setNameTest() {
		
		//Give some resources 
		String expectedResult = "Wolf";
		
		//When action occurs
		this.animal.setName(expectedResult);
		
		//Assert that the naame was entered correctly
		String actualResult = this.animal.getName();
		
		assertEquals(expectedResult, actualResult);		
		
	}
	
	@Test
	public void getNameTest() {
		
		//Give some resources 
		String expectedResult = "Wolf";
		Animal animal = new Animal(expectedResult, 32, "wolf", "fur");
		
		//When action occurs
		String actualResult = animal.getName();
		
		//Assert that the name was set correctly
		assertEquals(expectedResult, actualResult);		
		
	}


}
