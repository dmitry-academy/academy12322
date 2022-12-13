package by.academy.lesson7;

public class Recursion2 {

	static long test(long stop, int n) {

		if (stop-- == 0) {
			return 0;
		}
		if (n < 2) {
			return n;
		}
		System.out.println(stop);
		return n + test(stop, n - 1);
	}

	public static void main(String[] args) {

		int stop = 1000;
		long l = test(stop, 1010000);
	}
}
