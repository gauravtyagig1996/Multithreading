package multithreading;

public class N3 extends Thread {
	public void run(){
		for(int i=1; i<=10; i++){
			try{Thread.sleep(500);}catch (Exception e){System.out.println(e);} 
		System.out.println(i);	
	}
	}
		public static void main(String[] args){
			N3 m3=new N3();
			N3 m31=new N3();
			
			m3.run();
			m31.run();
		}
	
	}


