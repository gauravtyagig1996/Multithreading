package multithreading;

public class N8 extends Thread{
	public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
		  N8 n8=new N8();  
		  N8 n81=new N8();  
		  System.out.println("Name of n8:"+n8.getName());  
		  System.out.println("Name of n81:"+n81.getName());  
		   
		  n8.start();  
		  n81.start();  
		  
		  n8.setName("Sonoo ");  
		  System.out.println("After changing name of n8:"+n8.getName());  

}
}