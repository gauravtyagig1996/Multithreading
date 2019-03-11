package multithreading;

public class N1 extends Thread {
	public void run(){
		for (int i = 0; i <=6; i++) {
			try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
		System.out.println(i);	
		}
	}
	
	public static void main(String[] args) {
		
	
	
	N1 n=new N1();
	N1 n1=new N1();
	N1 n2=new N1();
	N1 n3=new N1();
	
	n.start();
	n1.start();
	n2.start();
	n3.start();
		
	}
}
