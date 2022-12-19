package by.academy.lesson7.oop.mod2;

import by.academy.lesson7.oop.mod1.Animal;

public class Dog extends Animal {

	private static Dog d;

	private Dog() {
		super();
	}

	public static Dog getDog() {
		if (d == null) {
			d = new Dog();
		}
		return d;
	}
}
