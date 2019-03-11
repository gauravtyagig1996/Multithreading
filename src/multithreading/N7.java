package multithreading;

public class N7 extends Thread{
	
	 public void run(){  
		  System.out.println(Thread.currentThread().getName());  
		 }  
		  
		 public static void main(String args[]){  
			 N7 n7=new N7();  
			 N7 n71=new N7();  
		  
		  n7.start();  
		  n71.start();  
		 }  

}
