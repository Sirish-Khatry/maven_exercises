package abstractInterfaceExercise;

public class Fish extends WaterAnimal {
	
	
	public Fish() {
		
	}
	
	public Fish(boolean amphibian, String type) {
		super(amphibian);
		this.type = type;
	}

	private String type;
	

	@Override
	public void swim() {
		System.out.println("Fish swims freely");
	}


	public void dive() {
		System.out.println("Fish dives deeper into the water");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void animalSound() {
		System.out.println("Fish purrs purrs");
		
	}
	
	

}
