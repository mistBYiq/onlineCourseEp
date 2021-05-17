package org.practice.matrix_task;

import java.util.Scanner;

import static org.practice.util.Util.ENTER_EVEN;
import static org.practice.util.Util.enterEvenNumber;
import static org.practice.util.Util.showMatrix;

public class MatrixTask05 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix();

        System.out.println("\nResult matrix ");
        showMatrix(matrix);
    }

    public static int[][] createMatrix() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(ENTER_EVEN);
            int n = enterEvenNumber(scanner);

            int[][] matrix = new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (n - i <= j) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = i + 1;
                    }
                }
            }
            return matrix;
        }
    }
}
