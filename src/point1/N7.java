package point1;

public class N7 implements Runnable {
	public void run() {
	
		System.out.println("task one");
	}
	public static void main(String args[]){  
		Thread t1 =new Thread(new N7());  
		Thread t2 =new Thread(new N7());  
		  
		t1.start();  
		t2.start();  
		  
		 }  
} 
