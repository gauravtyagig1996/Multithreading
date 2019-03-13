package multithreading.threadPooling;

public class Enonimus {
public static void main(String[] args) {
	Thread t= new Thread(){
		public void run(){
			System.out.println("Runnnn....");
		}
	};
	t.start();
}
}
