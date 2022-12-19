package by.academy.test;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int stringLength = Integer.MAX_VALUE;
        String minString = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество слов:");
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово:");
            array[i] = sc.next();
            if (uniqueChar(array[i]).length() < stringLength) {
                minString = array[i];
                stringLength = uniqueChar(array[i]).length();
            }
        }
        System.out.printf("Минимальное количество - %s в слове %s%n", stringLength, minString);
    }

    public static String uniqueChar(String word) {
        StringBuilder uniqueWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (uniqueWord.indexOf(String.valueOf(word.charAt(i))) < 0) {
                uniqueWord.append(word.charAt(i));
            }
        }
        return uniqueWord.toString();

    }
}