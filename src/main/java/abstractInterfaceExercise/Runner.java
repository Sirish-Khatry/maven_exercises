package abstractInterfaceExercise;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Fish();
		Animal b = new Dog();
		
		a.sleep();
		a.eat();
		a.getSpecies();
		((WaterAnimal) a).isAmphibian();
		
		
		b.sleep();
		b.eat();
		((Dog) b).walk();
		b.getSpecies();
		((LandAnimal) b).getLegs();
		
		a.animalSound();
		b.animalSound();
		
		
		LandAnimal landAnimal = (LandAnimal) b;
		landAnimal.getLegs();
	}

}
