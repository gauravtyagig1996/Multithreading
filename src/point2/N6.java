package point2;

public class N6 extends Thread{  
		  
		public void run(){  
		for(int i=1;i<=2;i++){  
		if(Thread.interrupted()){  
		System.out.println("code for interrupted thread");  
		}  
		else{  
		System.out.println("code for normal thread");  
		}  
		  
		} 
		}  
		  
		public static void main(String args[]){  
		  
		N6 n6=new N6();  
		N6 n61=new N6();  
		  
		n6.start();  
		n6.interrupt();  
		  
		n61.start();  
		  
		}  
		}  


