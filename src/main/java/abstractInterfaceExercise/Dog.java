package abstractInterfaceExercise;

public class Dog extends LandAnimal  {
	

	private String breed;
	
	public Dog() {
		
	}

	public Dog(int legs, String breed) {
		super(legs);
		this.breed = breed;
	}

	@Override
	public void walk() {
		System.out.println("Dog walks freely");
	}


	public void sniff() {
		System.out.println("Dog sniffs");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void animalSound() {
		
		System.out.println("Dog barks woof woof");
	}


}
