package abstractInterfaceExercise;

public interface EatBehaviour {
	
	default void eat() {
		System.out.println("Eats food");
	}

}
