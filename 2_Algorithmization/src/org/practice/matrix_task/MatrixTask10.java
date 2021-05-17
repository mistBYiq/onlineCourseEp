package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createSquareMatrix;

public class MatrixTask10 {

    public static void main(String[] args) {
        int[][] matrix = createSquareMatrix(MIN_R, MAX_R);

        showPositiveElementsDiagonal(matrix);
    }

    public static void showPositiveElementsDiagonal(int[][] matrix) {
        System.out.println("\nPositive elements of the main diagonal ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == j) && (matrix[i][j] > 0)) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
    }
}
