package by.academy.test;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите слова разделяя их пробелом");

		String[] words = scan.nextLine().split(" ");

		scan.close();

		int[] mass = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			char[] arr = words[i].toCharArray();
			int a = 0;
			for (int j = 0; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] == arr[k] && arr[j] != '\u0000') {
						arr[k] = '\u0000';
						a++;
					}
				}
			}
			mass[i] = words[i].length() - a;
		}

		int min = mass[0];
		int ind = 0;

		for (int i = 0; i < mass.length; i++) {
			if (min > mass[i]) {
				min = mass[i];
				ind = i;
			}
		}
		System.out.println(words[ind] + " - слово с минимальным количеством различных символов");
	}
}