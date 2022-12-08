package by.academy.test;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите тип данных");
        String type = sc.nextLine();
        System.out.println("Введите значение");
        int i = sc.nextInt();

        switch (type) {
            case ("int"):
                i = i % 2;
                System.out.println("остаток от деления на 2 = " + i);
                break;
            case ("double"):
                i = i - i * 70 / 100;
                System.out.println("70% от числа = " + (double) i);
                break;
            case ("float"):
                i = i * i;
                System.out.println("квадрат числа = " + (float) i);
                break;
            case ("char"):
                System.out.println("код символа = " + (char) i);
                break;
            case ("String"):
                System.out.println("Hello " + i);
                break;
            default:
                System.out.println("Unsupported type");
                break;

        }
        sc.close();


    }


}