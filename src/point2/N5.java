package point2;

public class N5 extends Thread{  
		  
		public void run(){  
		for(int i=1;i<=5;i++)  
		System.out.println(i);  
		}  
		  
		public static void main(String args[]){  
		N5 n5=new N5();  
		n5.start();  
		  
		n5.interrupt();  
		  
		}  
		}