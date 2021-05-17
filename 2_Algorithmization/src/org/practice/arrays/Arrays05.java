package org.practice.arrays;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayIntegers;
import static org.practice.util.Util.showArray;

public class Arrays05 {
    public static void main(String[] args) {
        int[] array = createArrayIntegers(MIN_R, MAX_R);

        showElementsLargeIndex(array);
    }

    public static void showElementsLargeIndex(int[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        System.out.println("\n" + AFTER_ARRAY);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
