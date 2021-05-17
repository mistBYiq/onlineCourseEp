package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createMatrix;
import static org.practice.util.Util.showMatrix;

public class MatrixTask13 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(MIN_R, MAX_R);

        System.out.println("\nSort Column Decrease ");
        sortColumnDecrease(matrix);
        showMatrix(matrix);

        System.out.println("\nSort Column Increase");
        sortColumnIncrease(matrix);
        showMatrix(matrix);
    }

    public static void sortColumnDecrease(int[][] m) {
        int temp;
        for (int n = 0; n < m[0].length; n++) {
            for (int i = 1; i < m.length; i++) {
                for (int j = m.length - 1; j >= i; j--) {
                    if (m[j - 1][n] < m[j][n]) {
                        temp = m[j - 1][n];
                        m[j - 1][n] = m[j][n];
                        m[j][n] = temp;
                    }
                }
            }
        }
    }

    public static void sortColumnIncrease(int[][] m) {
        int temp;
        for (int n = 0; n < m[0].length; n++) {
            for (int i = 1; i < m.length; i++) {
                for (int j = m.length - 1; j >= i; j--) {
                    if (m[j - 1][n] > m[j][n]) {
                        temp = m[j - 1][n];
                        m[j - 1][n] = m[j][n];
                        m[j][n] = temp;
                    }
                }
            }
        }
    }

}
