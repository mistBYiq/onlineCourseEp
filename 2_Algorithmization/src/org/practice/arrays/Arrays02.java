package org.practice.arrays;

import static org.practice.util.Util.AFTER_ARRAY;
import static org.practice.util.Util.GIVEN_ARRAY;
import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayDoubles;
import static org.practice.util.Util.enterPositiveDouble;
import static org.practice.util.Util.showArray;

public class Arrays02 {

    public static void main(String[] args) {
        System.out.println("Enter Z - *,* ");
        final double z = enterPositiveDouble(); //2.5;

        double[] array = createArrayDoubles(MIN_R, MAX_R); //{ 1.2, 1.8, 2.4, 3, 5.2, 10, 17.8, 23, 37.2, 42 };


        replaceAllMembersLargerThanGivenNumber(array, z);
    }

    public static void replaceAllMembersLargerThanGivenNumber(double[] array, double z) {
        System.out.println(GIVEN_ARRAY);
        showArray(array);

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }

        System.out.println("\n" + AFTER_ARRAY);
        showArray(array);
        System.out.println("\n" + "Number of replacements = " + counter);
    }
}
