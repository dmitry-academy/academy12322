package by.academy.lesson21;

public class Example {

	public static void main(String... args) throws InterruptedException {
		MyThread mythread = new MyThread();

		mythread.run();
		System.out.println("test");
	}

}
