package point2;

public class N7 {  
	    public synchronized void m() {  
	    n();  
	    System.out.println("this is m() method");  
	    }  
	    public synchronized void n() {  
	    System.out.println("this is n() method");  
	    } 

}
