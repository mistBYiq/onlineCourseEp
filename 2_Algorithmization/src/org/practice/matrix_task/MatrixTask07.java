package org.practice.matrix_task;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;
import static org.practice.util.Util.showMatrix;

public class MatrixTask07 {

    public static void main(String[] args) {
        double[][] matrix = createMatrix();

        System.out.println("\nResult matrix ");
        showMatrix(matrix);

        countPositiveNum(matrix);
    }

    public static double[][] createMatrix() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the square matrix");
            int n = enterPositiveGreaterThanOne(scanner);

            double[][] matrix = new double[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                }
            }
            return matrix;
        }
    }

    public static void countPositiveNum(double[][] matrix) {
        int positiveNum = 0;
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (doubles[j] > 0) {
                    positiveNum++;
                }
            }
        }
        System.out.println("\nNumber of positive elements in a matrix = " + positiveNum);
    }
}
