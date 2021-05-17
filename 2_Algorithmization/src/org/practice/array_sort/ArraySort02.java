package org.practice.array_sort;

import static org.practice.util.Util.showArray;

public class ArraySort02 {

    public static void main(String[] args) {
        int[] arrayOne = {1, 3, 5, 7, 9, 11};
        int[] arrayTwo = {2, 3, 4, 4, 6, 8, 10, 12, 14, 16};

        showArray(arrayOne);
        showArray(arrayTwo);
        arrayMerging(arrayOne, arrayTwo);
    }

    public static void arrayMerging(int[] arrayOne, int[] arrayTwo) {
        System.out.println("Post-merge sequence :");
        int i = 0;
        int j = 0;
        for (int k = 0; k < arrayOne.length + arrayTwo.length; k++) {
            if (i > arrayOne.length - 1) {
                System.out.print(arrayTwo[j] + "\t");
                j++;
            } else if (j > arrayTwo.length - 1) {
                System.out.print(arrayOne[i] + "\t");
                i++;
            } else if (arrayOne[i] < arrayTwo[j]) {
                System.out.print(arrayOne[i] + "\t");
                i++;
            } else {
                System.out.print(arrayTwo[j] + "\t");
                j++;
            }
        }
    }
}