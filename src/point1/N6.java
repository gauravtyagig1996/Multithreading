package point1;

public class N6 extends Thread {
	//multitasking in multithread
	public void run(){  
		   System.out.println("task one");  
		 }  
		 public static void main(String args[]){  
		  N6 q1=new N6();  
		  N6 q2=new N6();  
		  N6 q3=new N6();  
		  
		  q1.start();  
		  q2.start();  
		  q3.start();  
		 }  

}
