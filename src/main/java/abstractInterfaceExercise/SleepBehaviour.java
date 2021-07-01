package abstractInterfaceExercise;

public interface SleepBehaviour {

	default void sleep() {
		System.out.println("Sleeps happily");
	}
}
