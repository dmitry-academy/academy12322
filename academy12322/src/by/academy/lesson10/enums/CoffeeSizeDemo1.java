package by.academy.lesson10.enums;

public class CoffeeSizeDemo1 {
	public static void main(String[] args) {

		CoffeeSize coffeeSize = CoffeeSize.BIG;

		if (coffeeSize == CoffeeSize.BIG) {
			System.out.println(coffeeSize);
		} else {
			System.out.println("НЕ БИГ");
		}
		System.out.println(coffeeSize.getMl());
		System.out.println(coffeeSize.getMl());
		System.out.println(coffeeSize.getMl());

		CoffeeSize coffeeSize1 = CoffeeSize.valueOf("BIG");
		System.out.println(coffeeSize1.getClass());

		CoffeeSize2 coffee = CoffeeSize2.BIG;
//		CoffeeSize2 c2 = new CoffeeSize2();
		coffee.fly();
		coffee.test();
		
		System.out.println(coffee.getMl());
	}
}