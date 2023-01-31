package by.academy.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionChangingValuesDemo {
	public static void main(String... args) {

		Car car = new Car(500, "1233");
		Class<Car> carClass = Car.class;

		try {
			Field horsepower = carClass.getDeclaredField("horsepower");
			horsepower.setAccessible(true);

//			int modifiers1 = horsepower.getModifiers();
//			System.out.println(Modifier.isFinal(modifiers1));
//
////			
//			Field modifiersField = horsepower.getClass().getDeclaredField("modifiers");
//			modifiersField.setAccessible(true);
//			modifiersField.setInt(horsepower, horsepower.getModifiers() & ~Modifier.FINAL);
//			
//			int modifiers2 = horsepower.getModifiers();
//			System.out.println(Modifier.isFinal(modifiers2));
			
			System.out.println("Before change:" + horsepower.get(car));
			horsepower.set(car, 2);

			System.out.println("After change:" + horsepower.get(car));

			System.out.println(Modifier.isPrivate(horsepower.getModifiers()));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
