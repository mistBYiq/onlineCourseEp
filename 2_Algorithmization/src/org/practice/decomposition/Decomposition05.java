package org.practice.decomposition;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createArrayIntegers;
import static org.practice.util.Util.showArray;

public class Decomposition05 {

    public static void main(String[] args) {
        int[] array = createArrayIntegers(MIN_R, MAX_R);
//        int[] array = {1, 2, 22, 54, 8, 5, 75, 84, 14, 65, 84, 45};

        System.out.println("Given array");
        showArray(array);

        findSecondLargest(array);
    }

    public static void findSecondLargest(int[] array) {
        int maxNumber = 0;
        int secondMax = 0;

        for (int num : array) {
            if (num > maxNumber) {
                secondMax = maxNumber;
                maxNumber = num;
            } else if (num != maxNumber && num > secondMax) {
                secondMax = num;
            }
        }
        System.out.println("\nmax number = " + maxNumber);
        System.out.println("\nResult. Second max number = " + secondMax);
    }
}
