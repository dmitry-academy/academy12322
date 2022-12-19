package by.academy.test;

import java.util.Scanner;

public class HW2_Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первую строку: ");
		String str1 = scan.nextLine();
		System.out.println("Введите вторую строку: ");
		String str2 = scan.nextLine();
		scan.close();

		char array[] = new char[26]; // массив из букв
		char x = 'a';

		for (int q = 0; q < array.length; q++) {
			array[q] = x;
			x++;
		}

		int arr[] = new int[26]; // массив численный
		int y = 0;

		for (int z = 0; z < arr.length; z++) {// нули в массив
			arr[z] = 0;
		}

		int arr2[] = new int[16];

		for (int u = 0; u < str1.length(); u++) {// hello
			for (int n = 0; n < array.length; n++) {
				if (array[n] == str1.charAt(u)) {// индекс буквы в массиве букв h-h
					arr2[u] = n;
					System.out.println("2: " + arr2[0] + "" + arr2[1] + "" + arr2[2] + "" + arr2[3] + "" + arr2[4]); // 0
				}
			}
		}

		int count3 = 0;
		for (int m = 0; m < arr2.length; m++) {
			while (arr2[m] > 0) {
				if (arr2[m] == arr2[m + 1]) {
					count3++;
				} else {
				}
				break;
			}
		}

		int counter = 0;
		for (int i = 0; i < str1.length(); i++) { // первая строка
			for (int j = 0; j < str2.length(); j++) { // вторая строка
				if (str1.charAt(i) == str2.charAt(j)) {
					char l1 = str1.charAt(i); // букву по индексу

					for (int d = 0; d < array.length; d++) {
						if (array[d] == str1.charAt(i)) {// индекс буквы в массиве букв
							int foun = d;
							arr[foun] = arr[foun] + 1;
						}
					}
					counter++;
				} else {
				}
			}
		}

		int countTr = count3 + 1;
		int uni = str1.length() - countTr;
		int povtor = countTr * countTr;
		int length = povtor + uni;
		int sum = 0;

		for (int t = 0; t < arr.length; t++) {
			sum = sum + arr[t];
		}

		if (sum == counter && sum == length && counter > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}