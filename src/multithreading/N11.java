package multithreading;

public class N11 extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Domean thread working....");
			}
		else{
			System.out.println("user thread work...");
		}
	}

	public static void main(String[] args) {
		N11 n11=new N11();
		N11 n111=new N11();
		N11 n112=new N11();
		
		n11.setDaemon(true);
		
		n11.start();
		n111.start();
		n112.start();
	}
}
