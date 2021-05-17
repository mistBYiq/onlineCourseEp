package org.practice.arrays;

import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayDoubles;
import static org.practice.util.Util.showArray;

public class Arrays07 {

    public static void main(String[] args) {
        double[] array = createArrayDoubles(MIN_R, MAX_R);

        calculateValueExpression(array);
    }

    public static void calculateValueExpression(double[] array) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        int n = array.length;
        System.out.print("\n" + "pairs of numbers ");
        double max = array[0] + array[n - 1];
        System.out.print("\n" + array[0] + " " + array[n - 1]);

        for (int i = 1; i < array.length / 2; i++) {
            n--;
            System.out.print("\n" + array[i] + " " + array[n - 1]);
            if (array[i] + array[n - 1] > max) {
                max = array[i] + array[n - 1];
            }
        }

        System.out.print("\n" + "expression value is  " + max);
    }
}

