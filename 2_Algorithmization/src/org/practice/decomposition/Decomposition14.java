package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition14 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter K ");
            final int k = enterPositiveGreaterThanOne(scanner);

            findArmstrongNumbers(k);
        }
    }

    public static void findArmstrongNumbers(int k) {

        for (int i = 1; i < k; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println("Armstrong number = " + i);
            }
        }
    }

    private static boolean isArmstrongNumber(int number) {
        final double sum = countSum(number);
        final double degree = countNumberDigits(number);

        return Math.pow(sum, degree) == number;
    }

    private static int countNumberDigits(int number) {
        int counter = 0;

        while (number > 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }

    private static int countSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }
}
