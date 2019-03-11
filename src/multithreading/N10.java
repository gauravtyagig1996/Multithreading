package multithreading;

public class N10 extends Thread {

	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {
		N10 n10 = new N10();
		N10 n100 = new N10();
		n10.setPriority(Thread.MIN_PRIORITY);
		n100.setPriority(Thread.MAX_PRIORITY);
		
		n10.start();
		n100.start();

	}

}
