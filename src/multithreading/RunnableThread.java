package multithreading;

public class RunnableThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello Threads");
	}
	
	public static void main(String args[]) {
		RunnableThread ir = new RunnableThread();
		Thread t1 = new Thread(ir);
		Thread t2 = new Thread(ir);
		Thread t3 = new Thread(ir);
		Thread t4 = new Thread(ir);
		Thread t5 = new Thread(ir);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
