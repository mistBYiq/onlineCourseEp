package org.practice.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {

    public static final int ZERO = 0;
    public static final int MIN_R = -100;     // Minimum number for the range of the random method
    public static final int MAX_R = 200;  // Maximum number for the range of the random method
    public static final String TEXT_ERROR_ONE = "Sorry, but this is clearly not a positive integer! Enter positive integer!";
    public static final String TEXT_ERROR_TWO = "You entered a negative number! Enter positive integer!";
    public static final String ENTER_EVEN = "Enter the size of the square matrix. Where size is Even number";
    public static final String GIVEN_ARRAY = "Given an array: ";
    public static final String GIVEN_MATRIX = "Given an matrix: ";
    public static final String AFTER_ARRAY = "Array after checking and replacing";

    private Util() {
    }

    //getting a pseudo-random integer
    public static int getRandomNumberInteger(int minR, int maxR) {
        maxR -= minR;
        return (int) (Math.random() * ++maxR) + minR;
    }

    public static double getRandomNumberDouble(int minR, int maxR) {
        return (Math.random() * (maxR - minR + 1)) + minR;
    }

    public static int enterPositiveInteger() {
        Scanner scanner = new Scanner(System.in);

        return enterPositive(scanner);
    }

    public static double enterPositiveDouble() {

        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Sorry, but this is clearly not a positive double! Enter positive double!\"");
                scanner.next();
            }

            number = scanner.nextDouble();

            if (number <= 0) {
                System.out.println("You entered a negative number! Enter positive double!");
            }
        } while (number <= 0);

        return number;
    }

    public static int[] createArrayIntegers(int minR, int maxR) {
        System.out.println("Enter N the size of the array:");

        try (Scanner scanner = new Scanner(System.in)) {
            int n = enterPositive(scanner);

            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                result[i] = getRandomNumberInteger(minR, maxR); //writing pseudo-random elements to an array
            }
            return result;
        }
    }

    public static double[] createArrayDoubles(int minR, int maxR) {
        System.out.println("Enter N the size of the array doubles: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int n = enterPositive(scanner);

            double[] array = new double[n];

            for (int i = 0; i < n; i++) {
                array[i] = getRandomNumberDouble(minR, maxR);
            }
            return array;
        }
    }

    public static void showArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    public static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    private static int enterPositive(Scanner scanner) {
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println(TEXT_ERROR_ONE);
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println(TEXT_ERROR_TWO);
            }
        } while (n <= 0);
        return n;
    }

    public static int enterInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Sorry, but this is clearly not a integer! Enter integer!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int enterPositiveGreaterThanOne(Scanner scanner) {
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println(TEXT_ERROR_ONE);
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 1) {
                System.out.println("Enter a positive number greater than one");
            }
        } while (n <= 1);
        return n;
    }

    public static double enterPositiveDoubleGreaterThanOne(Scanner scanner) {
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Sorry, but this is clearly not a positive double! Enter positive double!\"");
                scanner.next();
            }

            number = scanner.nextDouble();

            if (number < 0) {
                System.out.println("You entered a negative number! Enter positive double!");
            }
        } while (number < 0);

        return number;
    }

    public static int enterEvenNumber(Scanner scanner) {
        int n;

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Sorry, but this is clearly not a number! Enter positive integer even number!");
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 0 || n % 2 != 0) {
                System.out.println("This value = " + n + " - is not positive integer even number. Try again!");
            }
        } while (n <= 0 || n % 2 != 0);

        return n;
    }

    public static int[][] createMatrix(int minR, int maxR) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows m in the matrix");
        int m = enterPositiveGreaterThanOne(scanner);
        System.out.println("Enter the number of columns n in the matrix");
        int n = enterPositiveGreaterThanOne(scanner);

        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = getRandomNumberInteger(minR, maxR);
            }
        }

        System.out.println(GIVEN_MATRIX);
        showMatrix(matrix);

        return matrix;
    }

    public static int[][] createSquareMatrix(int minR, int maxR) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the square matrix");
            int n = enterPositiveGreaterThanOne(scanner);

            int[][] matrix = new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = getRandomNumberInteger(minR, maxR);
                }
            }

            System.out.println(GIVEN_MATRIX);
            showMatrix(matrix);

            return matrix;
        }
    }

    public static void showMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void showMatrix(double[][] m) {
        for (double[] doubles : m) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(doubles[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void showArrayList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }
    }
}
