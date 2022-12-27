package by.academy.lesson10.enums;

public class CoffeeDemo {

	public static void main(String[] args) {
		Coffee3 coffee = new Coffee3();

		coffee.setColor("Red");
		coffee.setSize(CoffeeSize3.BIG);
		coffee.setWithMilk(false);
		System.out.println(coffee);

		System.out.println(coffee.getSize().getMl());
		System.out.println(coffee.getSize());

	}

}
