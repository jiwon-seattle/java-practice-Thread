package multithreading;

public class ExtendThread {
	public static void main (String[] args) {
		ThreadExercise t1 = new ThreadExercise(1);
		t1.start();
		
		ThreadExercise t2 = new ThreadExercise(2);
		t2.start();
		
		ThreadExercise t3 = new ThreadExercise(3);
		t3.start();
		
		ThreadExercise t4 = new ThreadExercise(4);
		t4.start();
		
		ThreadExercise t5 = new ThreadExercise(5);
		t5.start();
		
	}
}
