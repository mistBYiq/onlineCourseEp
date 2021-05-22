package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition17 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter N ");
            final int n = enterPositiveGreaterThanOne(scanner);

            countNumberActions(n);
        }
    }

    public static void countNumberActions(int number) {
        int counter = 0;

        while (number > 0) {
            number -= countSum(number);
            counter++;
        }

        System.out.println("Counter = " + counter);
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
