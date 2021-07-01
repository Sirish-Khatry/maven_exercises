package com.qa.equalshashcodeexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZooTest {
	
	@Test
	public void addAnimalTest() {
		Zoo zoo1 = new Zoo();
		
		//Give some resource
		String expectedResult = "Dog 2 Dog Fur animal";
		
		//When Action occurs
		zoo1.addAnimal("Dog", 2, "Dog", "Fur animal");
		zoo1.addAnimal("Bob", 2, "Dog", "Fur animal");
		
		//Assert that
		String actualResult = zoo1.getAnimal("Dog");
		assertEquals(expectedResult, actualResult);
	
	}
	
	
	@Test
	public void removeAnimalTest() {
		Zoo zoo1 = new Zoo();
		
		
		zoo1.removeAnimal("Dog");
		assertEquals(null, zoo1.getAnimal("Dog"));
	
	}
}
