package point1;

public class N3 implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		N3 runnable = new N3();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		Thread t2 = new Thread(tg1, runnable, "two");
		Thread t3 = new Thread(tg1, runnable, "three");
		System.out.println("Thread Group Name: " + tg1.getName());
		
		tg1.list();
		t1.start();
		t2.start();
		t3.start();

	}

}
