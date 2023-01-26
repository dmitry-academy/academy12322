package by.academy.lesson17.classwork;

import java.util.function.Function;
import java.util.function.Supplier;

import by.academy.lesson17.Car;
import by.academy.lesson17.CarTypes;

public class RefMethodsDemo {

	public static void main(String[] args) {

		Function<Double, Double> test = v -> {
			return Math.abs(v);
		};

		System.out.println(test.apply(-1.0));

		Function<Double, Double> test1 = Math::abs;
		System.out.println(test1.apply(-120.0));

		Supplier<Car> carSupplier = Car::new;

		CarCreator carCreator = Car::new;

		carCreator.get("Tesla");

		Car c = test(Car::new);
		Supplier<CarTypes> supplier = c::getType;
		System.out.println(supplier.get());

	}

	public static Car test(CarCreator carCreator) {
		return carCreator.get("BMW");
	}

}
