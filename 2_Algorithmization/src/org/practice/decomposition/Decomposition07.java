package org.practice.decomposition;

public class Decomposition07 {

    private static final int NINE = 9;

    public static void main(String[] args) {

        calculateSumFactorialsOdd(NINE);
    }

    public static void calculateSumFactorialsOdd(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum += countFactorial(i);
            }
        }
        System.out.println("The sum of the factorials of all odd numbers from 1 to 9,  Sum  = " + sum);
    }

    public static int countFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
