package point2;

public class N4 extends Thread{  
		public void run(){  
		try{  
		Thread.sleep(1000);  
		System.out.println("task");  
		}catch(InterruptedException e){  
		System.out.println("Exception handled "+e);  
		}  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		N4 n4=new N4();  
		n4.start();  
		  
		n4.interrupt();  
		  
		}  
		}  