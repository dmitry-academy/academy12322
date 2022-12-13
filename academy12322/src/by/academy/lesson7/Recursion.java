package by.academy.lesson7;

public class Recursion {

	static long factorial(long n) {
		if (n < 2) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	public static void main(String[] args) {
		System.out.println("Факториал 1: " + factorial(3));
		System.out.println("Факториал 2: " + factorial(3));
		System.out.println("Факториал 3: " + factorial(3));
		System.out.println("Факториал 4: " + factorial(4));
		System.out.println("Факториал 5: " + factorial(5));
		System.out.println("Факториал 10: " + factorial(10));
		System.out.println("Факториал 20: " + factorial(20));
		System.out.println("Факториал 55: " + factorial(55));
	}
}