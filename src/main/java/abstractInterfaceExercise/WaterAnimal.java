package abstractInterfaceExercise;

public abstract class WaterAnimal extends Animal {
	boolean Amphibian;
	
	public WaterAnimal() {
		
	}
	
	public WaterAnimal(boolean amphibian) {
		super();
		Amphibian = amphibian;
	}


	public abstract void swim();
	
	
	public boolean isAmphibian() {
		return Amphibian;
	}
	public void setAmphibian(boolean amphibian) {
		Amphibian = amphibian;
	}
}
