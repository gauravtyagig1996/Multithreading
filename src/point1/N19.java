package point1;

//static syncronization
	class l{  
		  
		 synchronized static void printTable(int n){  
		   for(int i=1;i<=10;i++){  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   }  
		 }  
		}  
		  
		class l1 extends Thread{  
		public void run(){  
		l.printTable(1);  
		}  
		}  
		  
		class l2 extends Thread{  
		public void run(){  
		l.printTable(10);  
		}  
		}  
		  
		class l3 extends Thread{  
		public void run(){  
		l.printTable(100);  
		}  
		}  
		  
		  
		  
		  
		class l4 extends Thread{  
		public void run(){  
		l.printTable(1000);  
		}  
		}  
		  
		public class N19{  
		public static void main(String t[]){  
		l1 t1=new l1();  
		l2 t2=new l2();  
		l3 t3=new l3();  
		l4 t4=new l4();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
		}  
		}  
