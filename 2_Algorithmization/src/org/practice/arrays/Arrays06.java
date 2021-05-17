package org.practice.arrays;

import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayDoubles;
import static org.practice.util.Util.showArray;

public class Arrays06 {

    public static void main(String[] args) {
        double[] array = createArrayDoubles(MIN_R, MAX_R);

        calculateSumPrimeOrdinalNumbers(array);
    }

    public static void calculateSumPrimeOrdinalNumbers(double[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(i + 1)) {
                sum += array[i];
            }
        }
        System.out.println("\n" + "The sum of the numbers is " + sum);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}