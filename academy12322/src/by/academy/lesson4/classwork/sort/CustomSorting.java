package by.academy.lesson4.classwork.sort;

import java.util.Arrays;

public class CustomSorting {

	public static void main(String[] args) {

		int[] array = { 4, 4, 5, 7, 3, 7, 1, 8, 10 };
		char[] charArray = { 'c', 'y', 'a', 'c', '5', 'l', 'f', 'q', 'm' };

		// { 4, 2, 5, 7, 3, 7, 1, 8, 10 } // шаг 1
		// { 10, 2, 5, 7, 3, 7, 1, 8, 10 }; // шаг 2
		// { 10, 2, 5, 7, 3, 7, 1, 8, 4 }; // шаг 3

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i]; // шаг 1
					array[i] = array[j]; // шаг 2
					array[j] = temp; // шаг 3
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
