package multithreading.threadPooling;

public class ThradWork implements Runnable{

	String message;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"This is HTread" +message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		process();
		System.out.println(Thread.currentThread().getName());
	}
	public ThradWork(String s){
		this.message=s;
	}
	public void process(){
			System.out.println("Hello");
	} 

	
}
