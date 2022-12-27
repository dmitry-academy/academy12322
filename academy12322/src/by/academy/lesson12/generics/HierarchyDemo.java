package by.academy.lesson12.generics;

public class HierarchyDemo {
	public static void main(String[] args) {
		
		
		GenericSuper<?> object = new GenericSub<>(88);
		
		if (object instanceof GenericSuper<?>) {
			System.out.println("object is instance of GenericSuper");
		}
		if (object instanceof GenericSub<?>) {
			System.out.println("object is instance of GenericSub");
		}

		// Ошибка компиляции - информация об обобщенном типе недоступна во время
		// выполнения
		/*
		 * if (object instanceof GenericSub<Integer>) {
		 * System.out.println("object is instance of GenericSub<Integer>"); }
		 */
	}
}