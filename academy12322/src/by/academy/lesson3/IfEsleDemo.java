package by.academy.lesson3;

public class IfEsleDemo {

	public static void main(String[] args) {

		int temperature = -13;

		if (temperature < -10) {
			System.out.println("Надеть очень теплую шапку -10");
		}
		if (temperature < -5) {
			System.out.println("Надеть шапку");
		}
		if (temperature < -3) {
			System.out.println("Надень зимнюю куртку");
		}
		if (temperature < -2) {
			System.out.println("Надень шарфик");
		}
		if (temperature < 5) {
			System.out.println("Зима!");
		} else {
			System.out.println("Можно без шапки");
		}

	}

}
