package org.practice.array_sort;

import java.util.ArrayList;
import java.util.Scanner;

import static org.practice.util.Util.showArray;

public class ArraySort01 {

    public static void main(String[] args) {

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arrayTwo = {20, 21, 22};

        unionTwoArraysWithReplaces(arrayOne, arrayTwo);
        System.out.println("Result array: ");
        showArray(arrayOne);

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int intValue : arrayOne) {
//            arrayList.add(intValue);
//        }
//        unionWithArrayList(arrayList, arrayTwo);
//        System.out.println("Result arrayList: ");
//        showArrayList(arrayList);
    }

    public static void unionTwoArraysWithReplaces(int[] arrayOne, int[] arrayTwo) {
        int lengthOne = arrayOne.length;
        int lengthTwo = arrayTwo.length;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number (from 1 to " + lengthOne + ")");
            int k = enterNumber(scanner, lengthOne);

            if ((k + lengthTwo) < lengthOne) {
                for (int i = 0, j = k; i < lengthTwo; i++, j++) {
                    if ((j + lengthTwo) < lengthOne) {
                        int temp;
                        for (int y = lengthOne - 1; y > j; y--) {
                            temp = arrayOne[y - 1];
                            arrayOne[y] = temp;
                        }
                    }
                    arrayOne[j] = arrayTwo[i];
                }
            } else {
                for (int i = 0, j = k; j < lengthOne; i++, j++) {
                    arrayOne[j] = arrayTwo[i];
                }
            }
        }
    }

    static void unionWithArrayList(ArrayList<Integer> arrayList, int[] arrayTwo) {
        int lengthOne = arrayList.size();
        int lengthTwo = arrayTwo.length;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number (from 1 to " + lengthOne + ")");
            int k = enterNumber(scanner, lengthOne);

            for (int i = 0; i < lengthTwo; i++, k++) {
                arrayList.add(k, arrayTwo[i]);
            }
        }
    }

    public static int enterNumber(Scanner scanner, int value) {
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Sorry, but this is clearly not a number! Try again!");
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 1 || n > value) {
                System.out.println("This value = " + n + " - is not in the range from 1 to " + value + ". Try again!");
            }
        } while (n <= 1 || n > value);
        return n;
    }
}