package by.academy.lesson4.classwork;

public class WhileDemo {

	public static void main(String[] args) {
		int a = -1;

//		while (a >= 0) {
//			System.out.println("а = " + a);
//			a--;
//		}
		// Нужно посчитать с помощью цикла от 5 до 0 включительно.

		do {
			System.out.println("а = " + a);
			a--;
		} while (a >= 0);
	}

}
