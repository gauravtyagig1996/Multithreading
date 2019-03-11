package multithreading;

public class N4 extends Thread {
	public void run(){
		for (int i = 1; i <=5; i++) {
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
			System.out.println(i);
			}
		}
	public static void main(String[] args) {
		N4 n4=new N4();
		N4 n41=new N4();
		N4 n42=new N4();
		N4 n43=new N4();
		
		n4.start();
		
		n41.start();
		
		n42.start();
		try{n42.join();}catch(Exception e){System.out.println(e);}
		n43.start();
	}

}
