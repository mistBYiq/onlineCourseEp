package org.practice.arrays;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayIntegers;
import static org.practice.util.Util.showArray;

public class Arrays10 {

    public static void main(String[] args) {
        int[] array = createArrayIntegers(MIN_R, MAX_R);

        replaceEverySecondElementZero(array);
    }

    public static void replaceEverySecondElementZero(int[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }

        System.out.println("\n" + AFTER_ARRAY);
        showArray(array);
    }
}