package org.practice.array_sort;

public class ArraySort08 {

    public static void main(String[] args) {
        long[] numerator = {1, 2, 6, 5, 2, 9, 2, 6, 12, 3};
        long[] denominator = {12, 5, 8, 9, 3, 7, 8, 6, 11, 4};

        System.out.println("Given fractions:");
        showFraction(numerator, denominator);

        convertFraction(numerator, denominator);
        System.out.println("\nCommon denominator of fractions:");
        showFraction(numerator, denominator);

        sort(numerator);
        System.out.println("\nResult sorted fractions:");
        showFraction(numerator, denominator);
    }

    public static void convertFraction(long[] arrayNumerator, long[] arrayDenominator) {
        long temp = commonDenominator(arrayDenominator);
        int n = arrayNumerator.length;

        for (int i = 0; i < n; i++) {
            arrayNumerator[i] = temp / arrayDenominator[i] * arrayNumerator[i];
            arrayDenominator[i] = temp;
        }
    }

    public static void sort(long[] a) {
        int n = a.length;
        int step = 1;

        while (step < n / 3) {
            step = 3 * step + 1;
        }

        while (step >= 1) {
            long temp;

            for (int i = step; i < n; i++) {
                for (int j = i; j >= step; j = j - step) {
                    if (a[j] < a[j - step]) {
                        temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }
            step = step / 3;
        }
    }

    public static long commonDenominator(long[] den) {
        int n = den.length;
        long temp = den[0];

        for (int i = 1; i < n; i++) {
            temp = nok(temp, den[i]);
        }

        System.out.println("\nCommon denominator = " + temp);
        return temp;
    }

    public static long nod(long a, long b) { //gcd
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static long nok(long a, long b) { //lcm
        return a / nod(a, b) * b;
    }

    public static void showFraction(long[] numerator, long[] denominator) {
        int n = numerator.length;
        for (int i = 0; i < n; i++) {
            System.out.print(numerator[i] + "/" + denominator[i] + "   ");
        }
    }
}