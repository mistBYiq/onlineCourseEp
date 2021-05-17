package org.practice.arrays;

import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.ZERO;
import static org.practice.util.Util.createArrayIntegers;
import static org.practice.util.Util.enterPositiveInteger;
import static org.practice.util.Util.showArray;

public class Arrays01 {

    public static void main(String[] args) {

        System.out.println("Enter K");
        final int k = enterPositiveInteger();

        int[] array = createArrayIntegers(ZERO, MAX_R);

        calculateSumOfElementsMultiplesOfNumber(array, k);
    }

    public static void calculateSumOfElementsMultiplesOfNumber(int[] array, int k) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        int sum = 0;
        try {
            if (array.length != 0) {
                for (int value : array) {
                    if (value % k == 0) {
                        sum += value;
                    }
                }
            } else {
                System.out.println("There are NO elements in the array ");
            }
        } catch (ArithmeticException exception) {
            System.err.println(exception.getMessage());
        }

        System.out.println("\n" + "The sum of elements of multiples of " + k + " is equal to "
                + sum);
    }
}
