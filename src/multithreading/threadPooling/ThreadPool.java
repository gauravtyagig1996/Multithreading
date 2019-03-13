package multithreading.threadPooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executer = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Runnable runna = new ThradWork("Hello"+i);
			executer.submit(runna);
		}
		executer.shutdown();
	}

}
