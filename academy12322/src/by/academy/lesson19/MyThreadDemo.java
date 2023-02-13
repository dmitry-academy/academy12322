package by.academy.lesson19;

public class MyThreadDemo {
	public static void main(String[] args) {

		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();
		myThread1.setDaemon(true);
//		myThread1.run();
//		myThread1.run();
//		myThread1.run();
//		myThread1.run();
		myThread1.start();
		myThread2.start();
		myThread3.start();
//		myThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("hello from main thread " + i);
		}
		System.out.println("hello there I  don't care about daemon");
	}
}