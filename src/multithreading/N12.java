package multithreading;

public class N12 extends Thread {
	
	public void run(){  
		  System.out.println("Name: "+Thread.currentThread().getName());  
		  System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
		 }  
		  
		 public static void main(String[] args){  
		  N12 n12=new N12();  
		  N12 n121=new N12();  
		  
		  n12.start();  
		  n12.setDaemon(true);  //will throw exception here  
		  n121.start();  
		 }  

}
