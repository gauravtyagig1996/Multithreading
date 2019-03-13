package point1;
	
	class a1{  
		  
		 void printTable(int n){  
		   synchronized(this){  
		     for(int i=1;i<=5;i++){  
		      System.out.println(n*i);  
		      try{  
		       Thread.sleep(400);  
		      }catch(Exception e){System.out.println(e);}  
		     }  
		   }  
		 }
		}  
		  
		class a2 extends Thread{  
		a1 t;  
		a2(a1 t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);  
		}  
		  
		}  
		class a3 extends Thread{  
		a1 t;  
		a3(a1 t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(100);  
		}  
		}  
		  
		public class N16{  
		public static void main(String args[]){  
		a1 obj = new a1();  
		a2 t1=new a2(obj);  
		a3 t2=new a3(obj);  
		t1.start();  
		t2.start();  
		}  
		}  