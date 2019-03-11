package multithreading;

public class N2 extends Thread {
	public void run(){
		System.out.println("running...");
	}

	public static void main(String[] args) {
		

	N2 n2=new N2();
	n2.run();
}
}