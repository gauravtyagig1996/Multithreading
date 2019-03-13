package multithreading.threadPooling;

public class A {
public static void main(String[] args) {
	A a = new A();
	new A();
	a= null;
	System.gc();
}
}
