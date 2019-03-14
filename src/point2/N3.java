package point2;

//intrupting a thread that stop working

public class N3 extends Thread{  
		public void run(){  
		try{  
		Thread.sleep(1000);  
		System.out.println("task");  
		}catch(InterruptedException e){  
		throw new RuntimeException("Thread interrupted..."+e);  
		}  
		  
		}  
		  
		public static void main(String args[]){  
		N3 n3=new N3();  
		n3.start();  
		try{  
		n3.interrupt();  
		}catch(Exception e){System.out.println("Exception handled "+e);}  
		  
		}  
		}  