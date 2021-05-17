package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createMatrix;
import static org.practice.util.Util.showMatrix;

public class MatrixTask12 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(MIN_R, MAX_R);

        System.out.println("\nSort Line Decrease");
        sortLineDecrease(matrix);
        showMatrix(matrix);

        System.out.println("\nSort Line Increase");
        sortLineIncrease(matrix);
        showMatrix(matrix);
    }

    public static void sortLineDecrease(int[][] m) {
        int temp;
        for (int n = 0; n < m.length; n++) {
            for (int i = 1; i < m[0].length; i++) {
                for (int j = m[0].length - 1; j >= i; j--) {
                    if (m[n][j - 1] < m[n][j]) {
                        temp = m[n][j - 1];
                        m[n][j - 1] = m[n][j];
                        m[n][j] = temp;
                    }
                }
            }
        }

    }

    public static void sortLineIncrease(int[][] m) {
        int temp;
        for (int n = 0; n < m.length; n++) {
            for (int i = 1; i < m[0].length; i++) {
                for (int j = m[0].length - 1; j >= i; j--) {
                    if (m[n][j - 1] > m[n][j]) {
                        temp = m[n][j - 1];
                        m[n][j - 1] = m[n][j];
                        m[n][j] = temp;
                    }
                }
            }
        }

    }
}