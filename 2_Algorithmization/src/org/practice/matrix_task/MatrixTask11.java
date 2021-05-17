package org.practice.matrix_task;

import static org.practice.util.Util.showMatrix;

public class MatrixTask11 {

    private static final int ZERO = 0;
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int TEN = 10;
    private static final int FIFTEEN = 15;
    private static final int TWENTY = 20;

    public static void main(String[] args) {
        int[][] matrix = createMatrix(ZERO, FIFTEEN);
        showMatrix(matrix);

        showLine(matrix);
    }

    public static void showLine(int[][] m) {

        int counter = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == FIVE) {
                    counter++;
                }
            }

            if (counter >= THREE) {
                System.out.println("The number " + FIVE + " occurs more than 3 times");
                System.out.println(" in line   " + (i + 1) + " ");
            }
            counter = 0;
        }
    }

    public static int[][] createMatrix(int minR, int maxR) {
        int[][] matrix = new int[TEN][TWENTY];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (maxR - minR + 1)) + minR;
            }
        }
        return matrix;
    }
}
