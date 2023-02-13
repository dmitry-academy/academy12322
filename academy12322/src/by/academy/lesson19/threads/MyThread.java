package by.academy.lesson19.threads;

public class MyThread extends Thread {

	private static int i = 0;

	public MyThread() {
		super("Thread: " + i++);

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(getName() + " " + getPriority());
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadCounter: " + i);
		}
	}
}
