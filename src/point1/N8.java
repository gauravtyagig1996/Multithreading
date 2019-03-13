package point1;

class sample extends Thread {
	public void run() {
		System.out.println("task one");
	}
}

 class sample1 extends Thread {
	public void run() {
		System.out.println("task two");
	}
}

public class N8 {
	public static void main(String args[]) {
		sample t1 = new sample();
		sample1 t2 = new sample1();

		t1.start();
		t2.start();
	}

}
