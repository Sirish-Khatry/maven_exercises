package abstractInterfaceExercise;

public abstract class Animal implements EatBehaviour, SleepBehaviour {
	
	private String species;
	private int age;
	private int weight;
	
	
	public Animal() {
		this("unknown");
	}
	
	public abstract void animalSound();
	
	
	public Animal(String species) {
		this.species = species;
	}
		
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
