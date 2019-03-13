package point1;

//syncronised mthod but in the method there is no syncronization object

	class Table{  
		void printTable(int n){//method not synchronized  
		   for(int i=1; i<=5; i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  
		class table2 extends Thread{  
		Table t;  
		table2(Table t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);  
		}  
		  
		}  
		class table3 extends Thread{  
		Table t;  
		table3(Table t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(100);  
		}  
		}  
		  
		public class N13{  
		public static void main(String args[]){  
		Table obj = new Table();//only one object  
		table2 t1=new table2(obj);  
		table3 t2=new table3(obj);  
		t1.start();  
		t2.start();  
		}  
		}  



