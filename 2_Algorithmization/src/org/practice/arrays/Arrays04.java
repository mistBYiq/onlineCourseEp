package org.practice.arrays;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayDoubles;
import static org.practice.util.Util.showArray;

public class Arrays04 {
    public static void main(String[] args) {
        double[] array = createArrayDoubles(MIN_R, MAX_R);

        swapMinAndMaxElement(array);
    }

    public static void swapMinAndMaxElement(double[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        double min = array[0];
        double max = array[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;

        System.out.println("\n" + AFTER_ARRAY);
        showArray(array);
    }
}