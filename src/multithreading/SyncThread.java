package multithreading;

public class SyncThread {
	public class DataContainer {
		private int intData;
		public int get() {
			return intData;
		}
		public void put(int value) {
			intData = value;
		}
	}
	
	public class Producer extends Thread {
		int data;
		DataContainer container;
		public Producer(DataContainer container, int data) {
			this.container = container;
			this.data = data;
		}
		
		@Override
		public synchronized void run() {
			System.out.println("Data[" + data + "] : set");
			container.put(data);
		}
	}
	
	public class Consumer extends Thread {
		DataContainer container ;
		public Consumer(DataContainer container) {
			this.container = container;
		}
		
		@Override
		public synchronized void run() {
			System.out.println("Data read: " + container.get());
		}
	}
	
	public static void main(String[] args) {
		SyncThread st = new SyncThread();
		DataContainer container = st.new DataContainer();
		Producer producer = st.new Producer(container, 24);
		producer.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Data Container" + container.get());
		Consumer consumer = st.new Consumer(container);
		consumer.setPriority(Thread.MIN_PRIORITY);
		
		try {
			producer.start();
			producer.join();
			consumer.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
