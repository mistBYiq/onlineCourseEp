package org.practice.matrix_task;

import java.util.Scanner;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.createMatrix;
import static org.practice.util.Util.showMatrix;

public class MatrixTask08 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(MIN_R, MAX_R);

        swapColumns(matrix);

        System.out.println("\nMatrix after checking and replacing");
        showMatrix(matrix);
    }

    public static void swapColumns(int[][] matrix) {
        try (Scanner scanner = new Scanner(System.in)) {
            final int length = matrix[0].length;
            System.out.println("Enter the number of the first column (from 1 to " + length + ")");
            int first = enterNumberColumn(scanner, length);
            System.out.println("Enter the number of the second column (from 1 to " + length + ")");
            int second = enterNumberColumn(scanner, length);

            int temp;
            for (int i = 0; i < matrix.length; i++) {
                temp = matrix[i][first - 1];
                matrix[i][first - 1] = matrix[i][second - 1];
                matrix[i][second - 1] = temp;
            }
        }
    }

    private static int enterNumberColumn(Scanner scanner, int value) {
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Sorry, but this is clearly not a positive integer! Try again!");
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 0 || n > value) {
                System.out.println("This value = " + n + " - is not in the range from 1 to " + value + ". Try again!");
            }
        } while (n <= 0 || n > value);

        return n;
    }
}