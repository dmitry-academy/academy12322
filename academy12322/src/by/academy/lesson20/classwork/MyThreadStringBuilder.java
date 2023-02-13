package by.academy.lesson20.classwork;

public class MyThreadStringBuilder extends Thread {

	private StringBuilder sb;

	public MyThreadStringBuilder(StringBuilder sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 100; i++) {
				System.out.print(sb);
			}
			char c = sb.charAt(0);
			sb.setCharAt(0, ++c);
			System.out.println();
		}
	}

}
