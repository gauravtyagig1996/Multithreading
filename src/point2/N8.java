package point2;

public class N8 {  
		public static void main(String args[]){  
		final N8 re=new N8();  
		  
		Thread t1=new Thread(){  
		public void run(){  
		 re.m();  
		}  
		};  
		t1.start();  
		}

			
		}



 class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    } 

}
