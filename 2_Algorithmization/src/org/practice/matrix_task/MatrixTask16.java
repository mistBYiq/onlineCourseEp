package org.practice.matrix_task;    //in progress

import java.util.Scanner;

public class MatrixTask16 {

    public static void main(String[] args) {
        int[][] matrix = createArrayTemp();
        showMatrix(matrix);
        testForMagic(matrix);
//        itMagic(matrix);



    }

    public static void itMagic(int[][] magicArr) {
        int n = (int) Math.sqrt(magicArr.length);
        int test;
        int magicSum = (int) ((n * (Math.pow(n, 2) + 1)) / 2);
        do {
            test = 0;
            if (lines(magicArr, magicSum)) {
                test++;
            }
            if (column(magicArr, magicSum)) {
                test++;
            }
            if (dioganals(magicArr, magicSum)) {
                test++;
            }
            showMatrix(magicArr);
            if (test < 3) {
                magicArr = shuffles(magicArr);
            }
//            System.out.println(lines(magicArr, magicSum));
//            System.out.println(column(magicArr, magicSum));
//            System.out.println(dioganals(magicArr, magicSum));
        }
        while (test < 3);
        System.out.println();
        showMatrix(magicArr);
    }


    public static void testForMagic(int[][] matrix) {
        int n = (int) Math.sqrt(matrix.length);
        int magicSum = (int) ((n * (Math.pow(n, 2) + 1)) / 2);

        if (lines(matrix, magicSum) && column(matrix, magicSum) && dioganals(matrix, magicSum)) {
            System.out.println("It's magic");
        } else {
            System.err.println("No magic");
        }
    }

    public static int[][] createArrayTemp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы N");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        int a = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++, a++) {
                m[i][j] = a;
            }
        }
        return m;
    }

    public static boolean lines(int[][] magic, int m) {
        for (int i = 0; i < magic.length; ) {
            int summ = 0;
            for (int j = 0; j < magic.length; j++) {
                summ += magic[i][j];
            }
       //     System.out.println(summ);
            if (summ == m) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean column(int[][] magic, int m) {

        for (int i = 0; i < magic.length; ) {
            int summ = 0;
            for (int j = 0; j < magic.length; j++) {
                summ += magic[j][i];
            }
          //  System.out.println(summ);
            if (summ == m) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean dioganals(int[][] magic, int m) {

        int summ = 0;
        boolean a = false;
        for (int i = 0; i < magic.length; i++) {
            summ += magic[i][i];
        }
       // System.out.println(summ);
        if (summ == m) {
            summ = 0;
            for (int i = magic.length - 1; i > 0; ) {
                for (int j = 0; j < magic.length; j++) {
                    summ += magic[i][j];
                    i--;
                }
            }
          //  System.out.println(summ);
            if (summ == m) {
                a = true;
            }
        }
        return a;
    }

    public static int[][] shuffles(int[][] m) {
        final int MIN_R = 0;
        final int MAX_R = m.length * m.length;
        int[] tempArr = new int[MAX_R];
        int a = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                tempArr[a] = m[i][j];
                System.out.print(" " + tempArr[a] + " ");
                a++;
            }
        }
        int temp;
        for (int i = 0; i < tempArr.length / 2; i++) {
            //Обмен m[i] со случайным элементом
            int r = (int) (Math.random() * (MAX_R - MIN_R)) + MIN_R;
            temp = tempArr[i];
            tempArr[i] = tempArr[r];
            tempArr[r] = temp;
        }
        int b = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = tempArr[b];
                b++;
            }
        }
        return m;
    }

    public static void showMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}