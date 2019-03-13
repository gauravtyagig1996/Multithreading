package multithreading.synchronization;

import java.util.ArrayList;
import java.util.List;

public class JavaSynchronization implements Runnable {

	synchronized void booking() {

		System.out.println("Book Ticket..");
	}

	

	public static void main(String[] args) {
		JavaSynchronization js = new JavaSynchronization();
		Thread t = new Thread(js);
		JavaSynchronization js1 = new JavaSynchronization();
		Thread t1 = new Thread(js1);
		JavaSynchronization js2 = new JavaSynchronization();
		Thread t2 = new Thread(js2);
		t.start();
		t1.start();
		t2.start();
		List<String> list= new ArrayList<String>();
		synchronized(list)
		{
		}

	}

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		booking();
	}

}
