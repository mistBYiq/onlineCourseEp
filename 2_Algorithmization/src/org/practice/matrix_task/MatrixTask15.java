package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createMatrix;
import static org.practice.util.Util.showMatrix;

public class MatrixTask15 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(MIN_R, MAX_R);

        replaceAllOdd(matrix);
        System.out.println("\nResult matrix ");
        showMatrix(matrix);
    }

    public static void replaceAllOdd(int[][] matrix) {
        int max = matrix[0][0];

        // find max element
        for (int[] value : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < value[j]) {
                    max = value[j];
                }
            }
        }

        // replace all odd ones with the maximum element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
    }
}