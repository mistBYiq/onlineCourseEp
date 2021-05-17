package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.ZERO;
import static org.practice.util.Util.createMatrix;

public class MatrixTask09 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(ZERO, MAX_R);

        calculateSumColumn(matrix);
    }

    public static void calculateSumColumn(int[][] matrix) {
        int value = 0;
        int max = 0;
        int maxColumn = 0;

        System.out.println("Sum of items in columns");
        for (int j = 0; j < matrix[0].length; ) {
            for (int[] ints : matrix) {
                value += ints[j];
            }
            System.out.print(value + " ");
            if (value > max) {
                max = value;
                maxColumn = j + 1;
            }
            j++;
            value = 0;
        }
        System.out.println("\n" + "Maximum sum = " + max + " in " + maxColumn + "-th column ");
    }
}
