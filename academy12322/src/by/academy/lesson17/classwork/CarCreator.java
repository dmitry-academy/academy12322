package by.academy.lesson17.classwork;

import by.academy.lesson17.Car;

@FunctionalInterface
public interface CarCreator {

	Car get(String model);
}
