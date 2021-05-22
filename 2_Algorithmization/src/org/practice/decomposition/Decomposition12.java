package org.practice.decomposition;

import java.util.Arrays;
import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition12 {
    private static final int LENGTH = 1000;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number K ");
            int k = enterPositiveGreaterThanOne(scanner);
            System.out.println("Enter second number N");
            int n = enterPositiveGreaterThanOne(scanner);

            createCustomArray(k, n);
        }
    }

    public static void createCustomArray(int k, int n) {
        int[] tempArray = new int[LENGTH];
        int counter = 0;

        for (int i = 0; i <= n; i++) {
            int temp = countSum(i);
            if (temp == k) {
                tempArray[counter] = i;
                counter++;
            }
        }

        verify(Arrays.copyOf(tempArray, counter));
    }

    private static int countSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

    private static void verify(int[] array) {
        if (array == null) {
            System.out.println("Array is null");
        } else if (array.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("\nResult array");

            for (int element : array) {
                System.out.print(element + "\t");
            }
        }
    }

}
