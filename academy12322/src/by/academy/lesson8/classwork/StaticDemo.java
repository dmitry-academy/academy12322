package by.academy.lesson8.classwork;

public class StaticDemo {

	public final static String SOME_ABSTRACT_CONST = "Cat";

	public static void main(String[] args) {

		Cat cat1 = new Cat("Зефир");
		Cat cat2 = new Cat("Леопольд");
		Cat cat3 = new Cat("Володя");

		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		cat1.setAge(10);

		Cat.setMoney(1000);

		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
	}

}
