package org.practice.array_sort;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.showArray;

public class ArraySort04 {

    public static void main(String[] args) {
        int[] array = { 2, 1, 2, 5, 10, 15, 20, 25, 30, 23, 42, 22, 1, 22, 34, 6, 9, 7, 53};
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        exchangeSorting(array);
        System.out.println(AFTER_ARRAY);
        showArray(array);
    }

    public static void exchangeSorting(int[] array) {
        final int length = array.length;
        int counter = 0;
        boolean needSort = true;

        while (needSort) {
            needSort = false;

            for (int i = 1; i < length; i++) {

                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    counter++;
                    needSort = true;
                }
            }
        }
        System.out.print("\nNumber of substitutions = " + counter + "\n");
    }

}
