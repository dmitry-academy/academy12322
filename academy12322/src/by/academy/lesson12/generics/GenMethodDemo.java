package by.academy.lesson12.generics;

public class GenMethodDemo {

	/**
	 * Является ли объект x элементом массива array
	 *
	 * @param x
	 * @param array
	 * @param <T>
	 * @param <V>
	 * @return
	 */
	public static <T, V> boolean isIn(T x, V[] array) {
		for (V element : array) {
			if (x.equals(element)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };

		if (isIn(2, intArray)) {
			System.out.println("2 входит в массив intArray");
		}

		if (!isIn(7, intArray)) {
			System.out.println("7 не входит в intArray");
		}
		System.out.println();

		String[] strArray = { "one", "two", "three", "four", "five" };

		if (isIn("five", strArray)) {
			System.out.println("five in array");
		}

//		if (!isIn("seven", strArray)) {
//			System.out.println("seven не входит в массив strArray");
//		}
	}
}