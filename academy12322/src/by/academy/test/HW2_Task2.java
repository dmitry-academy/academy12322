package by.academy.test;

import java.util.Scanner;

public class HW2_Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		String str1 = scan.nextLine();
		System.out.println("Введите второе слово: ");
		String str2 = scan.nextLine();
		System.out.println("Введите третье слово: ");
		String str3 = scan.nextLine();
		scan.close();

		char arr[] = new char[26];// числ
		char x = 'a';

		for (int q = 0; q < arr.length; q++) {
			arr[q] = x;
			x++;
		}

		int arr3[] = new int[26];

		for (int w = 0; w < str1.length(); w++) {
			for (int e = 0; e < arr.length; e++) {
				if (str1.charAt(w) == arr[e]) {
					arr3[e]++;
				}
			}
		}

		int countM1 = 0;
		for (int n = 0; n < arr3.length; n++) {
			if (arr3[n] == 1) {
				countM1++;
			}
		}

		// 2

		for (int z = 0; z < str2.length(); z++) {
			for (int s = 0; s < arr.length; s++) {
				if (str1.charAt(z) == arr[s]) {
					arr3[s]++;
				}
			}
		}

		int countM2 = 0;
		for (int g = 0; g < arr3.length; g++) {
			if (arr3[g] == 1) {
				countM2++;
			}
		}

		// 3

		for (int p = 0; p < str3.length(); p++) {
			for (int y = 0; y < arr.length; y++) {
				if (str1.charAt(p) == arr[y]) {
					arr3[y]++;
				}
			}
		}

		int countM3 = 0;
		for (int r = 0; r < arr3.length; r++) {
			if (arr3[r] == 1) {
				countM3++;
			}
		}

		if (countM1 > countM2) {
			if (countM2 > countM3)
				;
			System.out.println("str3");
		} else if (countM1 < countM3) {
			System.out.println("str1");
		} else {
			System.out.println("str2");
		}
	}
}