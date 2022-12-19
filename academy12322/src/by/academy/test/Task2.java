package by.academy.test;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое количество слов хотите ввести?");
        int n = sc.nextInt();
        System.out.println("Введите " + n + " слов");
        String[] arrayText = new String[n];
        for (int i = 0; i < arrayText.length; i++) {
            arrayText[i] = sc.next();
        }
        int mincount = 100;
        String textmin = null;
        int i = 0;
        while (i < arrayText.length) {
            String text1 = arrayText[i];
            int langtext = text1.length();
            int index = 1;
            char[] chars = text1.toCharArray();
            int charlang = chars.length;
            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[0 + j] != chars[1 + j]) {
                    index++;
                } else {
                    continue;
                }
            }
            if (langtext == charlang && (index < mincount)) {
                mincount = index;
                textmin = arrayText[i] + " ";
            }
            i++;
        }
        System.out.println("Слово с минимальным кол-вом различных символов - " + textmin);
        System.out.println("Различных символов в слове " + textmin + " - " + mincount);
        sc.close();
    }
}