package com.qa.equalshashcodeexercise;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	// private List<Animal> animal;
	private List<Animal> animal = new ArrayList<Animal>();
	
//	public Zoo() {
//		this.animal = new ArrayList<>();
//	}
	

	public void addAnimal(String name, int age, String type, String description) {
		animal.add(new Animal(name, age, type, description));
		
	}
	
	public void removeAnimal(String name) {
		
		for(Animal a : animal) {
			if(a.getName().equals(name)) {
				animal.remove(a);
			}
		}
		
	}
	
	public String getAnimal(String name) {
		String s = "";
		for(Animal a : animal) {
			if(a.getName().equals(name)) {
			return s = a.getName()+ " " + a.getAge()+ " " + a.getType()+ " " + a.getDescription();
			}
		}
		return null;
		
		
//		String animal = "";
//		
//		return animal = "Name: " + animal.getName() + "Age:" + animal2.getAge() + "Type: " + animal2.getType() + "Description: " + animal2.getDescription();
	}


	
	
}
