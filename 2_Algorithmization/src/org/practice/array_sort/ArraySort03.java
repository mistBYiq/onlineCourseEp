package org.practice.array_sort;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.showArray;

public class ArraySort03 {

    public static void main(String[] args) {
        int[] array = {23, 42, 22, 1, 22, 34, 6, 9, 7};
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        sortSelection(array);
        System.out.println(AFTER_ARRAY);
        showArray(array);
    }

    public static void sortSelection(int[] array) {
        final int length = array.length;

        for (int i = 0; i < length; i++) {
            int temp;
            int max = i;

            for (int j = max; j < length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }
}
