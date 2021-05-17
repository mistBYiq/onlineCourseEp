package org.practice.matrix_task;

public class MatrixTask14 {

    private static final int MIN = 20;
    private static final int MAX = 50;

    public static void main(String[] args) {
        createMatrix(MIN, MAX);
    }

    public static void createMatrix(int min, int max) {
        final int m = random(min, max);
        final int n = random(min, m);

        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (n > i && i <= j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            System.out.printf("%3d",matrix[i][j]);
            }
        System.out.println();
        }
    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}