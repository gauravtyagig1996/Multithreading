package point1;
//syncronization method by annonomous class

	class TT1{  
		 synchronized void printTable(int n){//synchronized method  
		   for(int i=1; i<=5; i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  
		public class N15{  
		public static void main(String args[]){  
		final TT1 obj = new TT1();  
		  
		Thread t1=new Thread(){  
		public void run(){  
		obj.printTable(5);  
		}  
		};  
		Thread t2=new Thread(){  
		public void run(){  
		obj.printTable(100);  
		}  
		};  
		  
		t1.start();  
		t2.start();  
		}  
		}  


