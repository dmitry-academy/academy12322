package by.academy.lesson17.classwork;

import java.util.function.Consumer;
import java.util.function.Supplier;

import by.academy.lesson3.cat.Cat;

public class CatSupplier {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.setAge(0);
		Supplier<Integer> sup = c::getAge;

		Consumer<Cat> catCunsumer1 = Cat::sleep;
		Consumer<Cat> catCunsumer2 = c1 -> c.sleep();

	}

	public void test(Cat obj) {
		obj.sleep();
	}

}
