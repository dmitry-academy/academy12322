package by.academy.lesson17;

public class CarFilter {

	public static void main(String[] args) {
		Car[] cars = { new Car(CarTypes.SPORT, 34000), new Car(CarTypes.SPORT, 44000), new Car(CarTypes.COMPACT, 14000),
				new Car(CarTypes.COMPACT, 10000) };

		// example with simple method
		System.out.println(countCompactCars(cars));
		System.out.println(countExpensiveCars(cars));

		// anonimous class
		System.out.println(countCars(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return CarTypes.SPORT == car.getType();
			}
		}));

		// lambda
		System.out.println(countCars(cars, c -> CarTypes.BIG == c.getType()));

	}

	private static int countCars(Car[] cars, Searchable search) {

		int counter = 0;
		for (Car car : cars) {
			if (search.test(car)) {
				counter++;
			}
		}
		return counter;
	}

	private static int countExpensiveCars(Car[] cars) {

		int counter = 0;
		for (Car car : cars) {
			if (car.getCost() > 20000) {
				counter++;
			}
		}
		return counter;
	}

	private static int countCompactCars(Car[] cars) {

		int counter = 0;
		for (Car car : cars) {
			if (car.getType() == CarTypes.COMPACT) {
				counter++;
			}
		}
		return counter;
	}
}
