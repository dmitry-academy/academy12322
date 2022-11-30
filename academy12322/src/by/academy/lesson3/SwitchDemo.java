package by.academy.lesson3;

public class SwitchDemo {
	public static void main(String... args) {

		int i = 1;

		switch (i) {
		case 1:
			System.out.println("число равно 1");
		case 2:
			System.out.println("число равно 2");
		case 3:
			System.out.println("число равно 3");
		case 4:
			System.out.println("число равно 4");
			break;
		case 6:
			System.out.println("число равно 6");
		default:
			System.out.println("default");
		}
	}
}
