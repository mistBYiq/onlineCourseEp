package org.practice.matrix_task;

import java.util.Scanner;

import static org.practice.util.Util.MAX_R;
import static org.practice.util.Util.MIN_R;
import static org.practice.util.Util.TEXT_ERROR_ONE;
import static org.practice.util.Util.createMatrix;

public class MatrixTask03 {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(MIN_R, MAX_R);

        showSpecificLineAndColumn(matrix);
    }

    public static void showSpecificLineAndColumn(int[][] m) {
        final int l = m.length;
        final int c = m[0].length;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter line number k (from 1 to " + l + ")");
            int k = enterNumber(scanner, l);
            System.out.println("Enter the column number p (from 1 to " + c + ")");
            int p = enterNumber(scanner, c);

            System.out.println(" line " + k);
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (i == k - 1) {
                        System.out.print(m[i][j] + "\t");
                    }
                }
            }

            System.out.println("\n" + " column " + p);
            for (int[] ints : m) {
                for (int j = 0; j < m[0].length; j++) {
                    if (j == p - 1) {
                        System.out.print(ints[j]);
                    }
                }
                System.out.println();
            }
        }
    }

    private static int enterNumber(Scanner scanner, int value) {
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println(TEXT_ERROR_ONE);
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
