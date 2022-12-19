package by.academy.test;

import java.util.Scanner;

public class Homework2Task2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите количество слов: ");
		int i = console.nextInt();
		console.nextLine();
		String[] array = new String[i];
		int[] count = new int[i];

		for (int s = 0; s < i; s++) { // цикл перебирает слова в массиве
			System.out.println("Введите слово: "); // пример: вводится слово "молоко"
			array[s] = console.nextLine();
			count[s] = array[s].length();
			for (int a = 0; a < array[s].length() - 1; a++) { // перебирает символы в строке
				for (int b = a + 1; b < array[s].length(); b++) {
					char c1 = array[s].charAt(a); // первый символ слова молоко= м
					char c2 = array[s].charAt(b); // второй символ слова молоко = о
					if (String.valueOf(c1).equals(String.valueOf(c2))) // сравниваем "м" и "о", если true
					{
						count[s] = count[s] - 1; // количество букв уменьшается на 1 при совпадении
						break;
					}
				}
			}
			System.out.println("В слове " + "\"" + array[s] + "\"" + " " + count[s] + " различных символов");
		}

		int min = 0;
		String minWord = new String();
		if (i > 1) {
			for (int massive = 0; massive < i - 1; massive++) {
				if (count[massive] <= count[massive + 1]) {
					min = count[massive];
					minWord = array[massive];
				} else {
					min = count[massive + 1];
					minWord = array[massive + 1];
				}
			}
			System.out.println("Слово " + minWord + " " + min + " различными символами наименьшее");

		} else
			System.out.println(
					"Слово " + "\"" + array[i - 1] + "\"" + " c " + count[i - 1] + " различными символами наименьшее");
		console.close();
	}
}