package by.academy.lesson4.classwork;

public class Example3 {

	public static void main(String[] args) {
		int i = 17;
		fBlock: for (int j = 0; j < 10; j++) {
			while (i <= 28) {
				if (i % 13 == 0) {
					System.out.println("НАШЛИ: " + i);
					break fBlock;
				}
				i++;
				System.out.println("пока не нашли: " + i);
			}
			System.out.println("J " + j + "завершен");
		}
	}

}
