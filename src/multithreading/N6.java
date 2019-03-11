package multithreading;

public class N6 extends Thread{
	public void run(){
	System.out.println("rumming");
	}
	public static void main(String[] args) {
		N6 n6=new N6();
		N6 n61=new N6();
		N6 n62=new N6();
		
		System.out.println("name n6:"+n6.getName());
		System.out.println("name n61:"+n61.getName());
		System.out.println("name n62:"+n62.getName());
		
		n6.start();
		n61.start();
		n62.start();
		
		n6.setName("Sono");  
		  System.out.println("After changing name of n6:"+n6.getName());  
		
	}

}
