package by.academy.lesson4.classwork;

import java.util.Arrays;

public class Task2 {
//	2. Создать массив типа String размером 3х6. И записать в него значения:
//		a1  a2  a3  a4  a5  a6
//		b1  b2  b3  b4  b5  b6
//		c1  c2   c3  c4  c5  c6
//		И распечатать.

	public static void main(String[] args) {
		String[][] arr = new String[3][6];

		char c = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = String.valueOf(c + (j + 1));
			}
			c++;
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
