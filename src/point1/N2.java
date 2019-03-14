package point1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class N2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable w1 = new N1("" + i);
			executor.execute(w1);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}

}
