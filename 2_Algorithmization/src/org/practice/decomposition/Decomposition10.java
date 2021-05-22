package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;
import static org.practice.util.Util.showArray;

public class Decomposition10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter N");
            int n = enterPositiveGreaterThanOne(scanner);

            int[] array = createArray(n);

            System.out.println("\nResult array: ");
            showArray(array);
        }
    }

    public static int[] createArray(int n) {
        int length = countLength(n);
        int[] array = new int[length];
        int index = length - 1;

        while (n > 0) {
            array[index] = n % 10;
            n /= 10;
            index--;
        }
        return array;
    }

    private static int countLength(int n) {
        int length = 0;

        while (n > 0) {
            length++;
            n /= 10;
        }
        return length;
    }
}