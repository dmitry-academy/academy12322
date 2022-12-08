package by.academy.lesson5.strings;

import by.academy.lesson5.classwork.Cat;

public class ValueOfDemo {

	public static void main(String[] args) {

		Cat c = new Cat("васька");
		String longString = String.valueOf(9999999999999l);
		String intString = String.valueOf(9999999);
		System.out.println(longString);
		System.out.println(intString);
		System.out.println("9999999999999");
		System.out.println(String.valueOf(9999999).getClass());

		System.out.println(String.valueOf(c));
	}

}
