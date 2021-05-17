package org.practice.array_sort;

import static org.practice.util.Util.showArray;

public class ArraySort06 {

    public static void main(String[] args) {
        double[] array = {1, 5, 10, 12, 15, 20, 25, 30, 23, 42, 22, 1, 22, 34, 6, 9, 7, 53};
        showArray(array);

        sortShell(array);
        showArray(array);
    }

    public static void sortShell(double[] doubles) {
        int length = doubles.length;
        int step = 1;

        while (step < length / 3) {
            step = 3 * step + 1; // Knuth's method: (3 ^ k -1) / 2
        }
        while (step >= 1) {
            double temp;
            for (int i = step; i < length; i++) {
                for (int j = i; j >= step && doubles[j] < doubles[j - step]; j = j - step) {
                    temp = doubles[j];
                    doubles[j] = doubles[j - 1];
                    doubles[j - 1] = temp;
                }
            }
            step = step / 3;
        }
    }
}
