package org.practice.matrix_task;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createSquareMatrix;

public class MatrixTask02 {

    public static void main(String[] args) {
        int[][] matrix = createSquareMatrix(MIN_R, MAX_R);

        showDiagonals(matrix);
    }

    public static void showDiagonals(int[][] m) {
        System.out.println("\nFirst diagonal");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) {
                    System.out.print(m[i][j] + "\t");
                }
            }
        }

        System.out.println("\nSecond diagonal");
        for (int i = m.length - 1; i > 0; ) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
                i--;
            }
        }
    }
}
