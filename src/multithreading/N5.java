package multithreading;

public class N5 extends Thread {
	public void run(){
		for(int i=1; i<=8; i++){
			try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		N5 n5=new N5();
		N5 n51=new N5();
		N5 n52=new N5();
		N5 n53=new N5();
	
	n5.start();
	
	try{n5.join(1000);}catch(Exception e){System.out.println(e);}
	
	n51.start();
	n52.start();
	n53.start();
		
	}

}
