package multithreading;

public class Com_pack1 extends Thread {
	
	public void run(){
		for (int i = 1; i <=10; i++) {
			try {Thread.sleep(500);} catch(InterruptedException e){System.out.println(e);} 
			System.out.println(i);
			
		}

			
			
		}
		public static void main(String args[]){
			
			Com_pack1 cp=new Com_pack1();
			Com_pack1 cp1=new Com_pack1();
			Com_pack1 cp2=new Com_pack1();
			
			cp.start();
			cp1.start();
			cp2.start();
			
			
		}
	}


