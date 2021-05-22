package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition11 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int first = enterPositiveGreaterThanOne(scanner);
            System.out.println("Enter second number");
            int second = enterPositiveGreaterThanOne(scanner);

            defineNumberWithLargeNumberOfDigits(first, second);
        }
    }

    public static void defineNumberWithLargeNumberOfDigits(int first, int second) {
        int firstLength = countLength(first);
        int secondLength = countLength(second);

        System.out.print("\nNumber with more digits = ");
        System.out.println(firstLength < secondLength ? second : first);
    }

    private static int countLength(int number) {
        int length = 0;

        while (number > 0) {
            length++;
            number /= 10;
        }
        return length;
    }
}
