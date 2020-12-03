package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        name();
        age();
        numbers();
    }

    public static void name() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();

        int index = name.length() - 1;
        String reversedString = "";

        while (index >= 0) {
            char currentChar = name.charAt(index);
            reversedString = reversedString + currentChar;
            index = index - 1;
        }

        System.out.println(reversedString);
    }

    public static void age() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        if (age < 0) {
            System.out.println("Дурак отрицательный возраст вводить?");
        }
        if (age > 0 & age < 18) {
            System.out.println("Учи уроки эмобой!");
        } else System.out.println("Папе за пивом тепрь ходишь и в ПОЛЬШУ!");
    }

    public static void numbers() {
        Scanner in = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
            num[i] = in.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for (int i = 1; i < 5; i++) {
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
        }

        System.out.printf("Максимальное число - %d\n", max);
        System.out.printf("Минимальное  число - %d\n", min);
    }
}
