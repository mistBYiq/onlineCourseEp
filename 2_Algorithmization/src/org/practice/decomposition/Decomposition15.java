package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition15 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter N ");
            final int n = enterPositiveGreaterThanOne(scanner);

            findNumber(n);
        }
    }

    public static void findNumber(int n) {
        int numStart = findStartNumber(n);
        int numEnd = numStart * 10;

        for (int i = numStart; i < numEnd; i++) {
            if (verifyNum(i)) {
                System.out.println("Number" + i);
            }
        }
    }

    private static boolean verifyNum(int number) {
        int temp = number % 10;
        number /= 10;
        boolean result = true;

        while (number > 0) {
            if ((number % 10) + 1 != temp) {
                result = false;
                break;
            }
            temp = number % 10;
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
