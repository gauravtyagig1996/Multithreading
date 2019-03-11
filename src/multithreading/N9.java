package multithreading;

public class N9 extends Thread{
	
	public void run(){  
		  System.out.println(Thread.currentThread().getName());  
		 }  
		 public static void main(String args[]){  
			 N9 n9=new N9();  
			 N9 n91=new N9();  
		  
		  n9.start();  
		  n91.start();  
		 }  

}
