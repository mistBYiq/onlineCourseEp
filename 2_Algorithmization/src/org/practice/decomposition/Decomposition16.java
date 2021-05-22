package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition16 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter N - the significance of the numbers");
            int n = enterPositiveGreaterThanOne(scanner);

            countSumOdd(n);
        }
    }

    public static void countSumOdd(int n) {
        int numStart = findStartNumber(n);
        int numEnd = numStart * 10;
        int sum = 0;

        for (int i = numStart; i < numEnd; i++) {
            if (isAllDigitsOdd(i)) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum of all n-digit numbers = " + sum);
        countNumberEven(sum);
    }

    private static void countNumberEven(int number) {
        int count = 0;

        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                count++;
            }
            number /= 10;
        }

        System.out.println("The number of even digits in the sum = " + count);
    }

    private static boolean isAllDigitsOdd(int number) {
        boolean result = true;

        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                result = false;
                break;
            }
            number /= 10;
        }

        return result;
    }

    private static int findStartNumber(int n) {
        int num = 1;

        for (int i = 1; i < n; i++) {
            num *= 10;
        }

        return num;
    }
}
