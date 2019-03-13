package point1;

public class N1 implements Runnable {

	private String message;

	public N1(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + " (End)");

	}

	private void processmessage() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}