package by.academy.test;

import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int n = sc.nextInt();
        String tempWord = "";
        int countChars = 0;
        int countTempChars = 9999;
        char tempChar = ' ';
        String[] mas = new String[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.next();
        }
        for (int i = 0; i < mas.length; i++) {
            char[] massChar = mas[i].toCharArray();
            for (int j = 0; j < massChar.length; j++) {
                char c = massChar[j];
                if (c != tempChar) {
                    countChars++;
                }
                tempChar = c;
            }
            if (countChars<countTempChars){
                tempWord = mas[i];
                countTempChars = countChars;
            }
            countChars = 0;
        }
        System.out.println(tempWord);
    sc.close();
    }

}