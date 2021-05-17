package org.practice.arrays;

import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayDoubles;
import static org.practice.util.Util.showArray;

public class Arrays03 {

    public static void main(String[] args) {
        double[] array = createArrayDoubles(MIN_R, MAX_R);

        countZeroNegativePositiveElements(array);
    }

    public static void countZeroNegativePositiveElements(double[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;

        for (double value : array) {
            if (value < 0) {
                negativeNum++;
            }
            if (value == 0) {
                zeroNum++;
            }
            if (value > 0) {
                positiveNum++;
            }
        }

        System.out.println("\n" + "Number of positive elements " + positiveNum);
        System.out.println("Number of zero elements " + zeroNum);
        System.out.println("Number of negative elements " + negativeNum);
    }
}