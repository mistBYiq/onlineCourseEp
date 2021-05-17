package org.practice;

import java.util.Scanner;

public class Util {
    public static double enterDouble() {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        return value;
    }

    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        return value;
    }

    public static int enterPositiveInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter positive integer");
            // checking whether an integer
            while (!scanner.hasNextInt()) {
                System.out.println("ERROR!");
                scanner.next();
            }
            number = scanner.nextInt();
        // checking if the number is positive
        } while (number <= 0);

        return number;
    }
}
