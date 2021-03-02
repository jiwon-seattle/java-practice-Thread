package multithreading;

public class ThreadExercise extends Thread {
	private int thread;
	ThreadExercise(int thread) {
		this.thread = thread;
	}
	@Override
	public void run() {
		System.out.println("Thread started: " + this.thread);
	}
}

