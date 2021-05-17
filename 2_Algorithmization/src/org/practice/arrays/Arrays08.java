package org.practice.arrays;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayIntegers;
import static org.practice.util.Util.showArray;

public class Arrays08 {

    public static void main(String[] args) {
        int[] array = createArrayIntegers(MIN_R, MAX_R);

        createNewArrayExcludeMin(array);
    }

    public static void createNewArrayExcludeMin(int[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        System.out.println("\n" + "Minimum element " + min);
        int counter = 0;
        for (int value : array) {
            if (value == min) {
                counter++;
            }
        }

        int[] arrayNew = new int[array.length - counter];
        int indexNewArr = 0;

        for (int value : array) {
            if (value != min) {
                arrayNew[indexNewArr++] = value;
            }
        }

        System.out.println("\n" + AFTER_ARRAY);
        showArray(arrayNew);
    }
}