package abstractInterfaceExercise;

public abstract class LandAnimal extends Animal {
	
	private int legs;
	
	public abstract void walk();
	
	public LandAnimal() {
		
	}

	public LandAnimal(int legs) {
		super();
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	

}
