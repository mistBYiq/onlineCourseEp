package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createMatrix;

public class MatrixTask01 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(MIN_R, MAX_R);

        showColumns(matrix);
    }

    public static void showColumns(int[][] m) {
        System.out.println("\nColumns whose first element is greater than the last ");

        for (int[] ints : m) {
            for (int j = 0; j < m[0].length; j += 2) {
                if (m[0][j] > m[m.length - 1][j]) {
                    System.out.print(ints[j] + "\t");
                }
            }
            System.out.println();
        }
    }


}