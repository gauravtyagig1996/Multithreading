package point1;
  //syncronization method
	
	class T1{  
		 synchronized void printTable(int n){  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  
		class T2 extends Thread{  
		T1 t;  
		T2(T1 t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);  
		}  
		  
		}  
		class T3 extends Thread{  
		T1 t;  
		T3(T1 t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(100);  
		}  
		}  
		  
		public class N14{  
		public static void main(String args[]){  
		T1 obj = new T1();//only one object  
		T2 t1=new T2(obj);  
		T3 t2=new T3(obj);  
		t1.start();  
		t2.start();  
		}  
		}  


