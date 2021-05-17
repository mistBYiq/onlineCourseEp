package org.practice.arrays;

import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayIntegers;
import static org.practice.util.Util.showArray;

public class Arrays09 {

    public static void main(String[] args) {
        int[] array = createArrayIntegers(MIN_R, MAX_R);
        //int[] array = {9, 3, 9, 3, 3, 2, 3, 8, 9, 9, 2, 2, 2};

        findMinRepeatElement(array);
    }

    public static void findMinRepeatElement(int[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        int count = 1;
        int temp;
        int num = array[0];
        for (int j : array) {
            temp = countNumberOfRepetitions(array, j);
            if (count < temp) {
                num = j;
                count = temp;
            }
            if (count == temp) {
                if (j < num) {
                    num = j;
                }
            }
        }

        if (num > 1) {
            System.out.println("\n" + "Number  " + num + " number of repetitions "
                    + countNumberOfRepetitions(array, num));
        } else {
            System.out.println("\n" + "There are NO duplicate elements in the array ");
        }
    }

    public static int countNumberOfRepetitions(int[] array, int num) {
        int count = 0;
        for (int value : array) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }
}