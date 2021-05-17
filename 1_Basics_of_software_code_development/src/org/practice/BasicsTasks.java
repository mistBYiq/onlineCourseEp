package org.practice;

import java.math.BigInteger;

import static org.practice.Util.enterDouble;
import static org.practice.Util.enterInt;
import static org.practice.Util.enterPositiveInteger;


public class BasicsTasks {

    static final int SECONDS_IN_HOUR = 3600;
    static final int SECONDS_IN_MINUTE = 60;
    static final int ONE_HUNDRED = 100;
    static final int TWO_HUNDRED = 200;

    private BasicsTasks() {
    }

    // linear01
    public static void findZ() {
        System.out.println("Enter variable A");
        int a = enterInt();
        System.out.println("Enter variable B");
        int b = enterInt();
        System.out.println("Enter variable C");
        int c = enterInt();

        int result = ((a - 3) * b / 2) + c;
        System.out.println("The value of the function is =  " + result);
        System.out.println();
    }

    // linear02
    public static void calculate() {
        System.out.println("Enter variable A");
        int a = enterInt();
        System.out.println("Enter variable B");
        int b = enterInt();
        System.out.println("Enter variable C");
        int c = enterInt();

        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("The value of the function is = " + result);
        System.out.println();
    }

    // linear03
    public static void estimate() {
        System.out.println("Enter the value of the variable X");
        int x = enterInt();
        System.out.println("Enter the value of the variable Y");
        int y = enterInt();

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("The value of the function is = " + result);
        System.out.println();
    }

    // linear04
    public static void swap() {
        System.out.println("Enter a number like nnn,ddd");
        double x = enterDouble();

        double result = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println("The resulting value of the number = " + result);
        System.out.println();
    }

    // linear05
    public static void showTime() {
        System.out.println("Enter time T in seconds");
        int t = enterInt();

        int hours = t / SECONDS_IN_HOUR;
        int minutes = t % SECONDS_IN_HOUR / SECONDS_IN_MINUTE;
        int seconds = t % SECONDS_IN_MINUTE;

        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
        System.out.println();
    }

    // linear06
    public static void checkCoordinates() {
        System.out.println("Enter coordinate X");
        int x = enterInt();
        System.out.println("Enter coordinate Y");
        int y = enterInt();

        boolean result = (((x >= -2) && (x <= 2) && (y <= 4) && (y >= 0)) ||
                ((x >= -4) && (x <= 4) && (y >= -3) && (y <= 0)));

        System.out.println(result);
        System.out.println();
    }

    //branching01
    public static void defineTriangle() {
        System.out.println("Enter the value of the first angle of the triangle in degrees");
        int a = enterInt();
        System.out.println("Enter the value of the second angle of the triangle in degrees");
        int b = enterInt();

        if ((a + b) >= 180) {
            System.out.println("Such a triangle does NOT exist");
        } else if ((a == 90) || (b == 90) || (a + b == 90)) {
            System.out.println("The triangle exists, is rectangular");
        } else {
            System.out.println("The triangle exists");
        }
    }

    //branching02
    public static void findExpressionValue() {
        System.out.println("Enter the value a");
        int a = enterInt();
        System.out.println("Enter the value b");
        int b = enterInt();
        System.out.println("Enter the value c");
        int c = enterInt();
        System.out.println("Enter the value d");
        int d = enterInt();

        int result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Expression value = " + result);
    }

    //branching03
    public static void locatePoints() {
        System.out.println("Enter the value \"x1\" for point \"A\"");
        int x1 = enterInt();
        System.out.println("Enter the value \"y1\" for point \"A\"");
        int y1 = enterInt();
        System.out.println("Enter the value \"x2\" for point \"B\"");
        int x2 = enterInt();
        System.out.println("Enter the value \"y2\" for point \"B\"");
        int y2 = enterInt();
        System.out.println("Enter the value \"x3\" for point \"C\"");
        int x3 = enterInt();
        System.out.println("Enter the value \"y3\" for point \"C\"");
        int y3 = enterInt();

        // calculate the sides of the assumed triangle
        double sideAB = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        double sideBC = Math.sqrt(Math.pow(Math.abs(x2 - x3), 2) + Math.pow(Math.abs(y2 - y3), 2));
        double sideAC = Math.sqrt(Math.pow(Math.abs(x1 - x3), 2) + Math.pow(Math.abs(y1 - y3), 2));

        // semi-perimeter
        double p = (sideAB + sideBC + sideAC) / 2;

        // area of a triangle according to Heron's formula
        double s = Math.sqrt(p * (p - sideAB) * (p - sideBC) * (p - sideAC));

        System.out.println("Are the points on one straight line : " + (s == 0));
    }

    //branching04
    public static void determine() {
        System.out.println("Enter value \"A\" for rectangular hole");
        int a = enterInt();
        System.out.println("Enter value \"B\" for rectangular hole");
        int b = enterInt();
        System.out.println("Enter the value \"x\" for brick");
        int x = enterInt();
        System.out.println("Enter the value \"y\" for brick");
        int y = enterInt();
        System.out.println("Enter the value \"z\" for brick");
        int z = enterInt();

        if (((x <= a) && (y <= b)) || ((y <= a) && (x <= b)) ||
                ((x <= a) && (z <= b)) || ((z <= a) && (x <= b)) ||
                ((y <= a) && (z <= b)) || ((z <= a) && (y <= b))) {
            System.out.println("The brick will pass");
        } else {
            System.out.println("The brick will NOT pass");
        }
    }

    //branching05
    public static void compute() {
        System.out.println("Enter the value \"x\" ");
        int x = enterInt();

        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - (3 * x) + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Result = " + result);
    }

    //cycles01
    public static void summarize() {
        int count = enterPositiveInteger();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    //cycles02
    public static void count() {
        System.out.println("Enter the value a");
        int a = enterInt();
        System.out.println("Enter the value b");
        int b = enterInt();
        System.out.println("Enter step value");
        int h = enterInt();

        for (int i = a; i <= b; i += h) {
            if ((i > 2) || (i == 0)) {
                System.out.print(i + "  ");
            } else {
                System.out.print(-i + "  ");
            }
        }
    }

    // cycles03
    public static void addUpSquares() {
        double sum = 0;

        for (int i = 0; i <= ONE_HUNDRED; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println("The sum is = " + sum);
    }

    // cycles04
    public static void multiplySquares() {
        BigInteger result = BigInteger.ONE;
        BigInteger value;

        for (int i = 1; i <= TWO_HUNDRED; i++) {
            value = BigInteger.valueOf(i);
            value = value.multiply(value);
            result = value.multiply(value);
        }

        System.out.println("Multiply of squares 200 numbers = " + result);
    }

    // cycles05
    public static void findSum() {
        System.out.println("Enter the value e");
        int e = enterInt();
        System.out.println("Enter the value n");
        int n = enterInt();
        double value;
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            // n-th member of the series
            value = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (e <= Math.abs(value)) {
                sum += value;
            }
        }

        System.out.println("The sum is = " + sum);
    }

    // cycles06
    public static void showSymbols() {
        for (int i = 0; i < 255; i++) {
            System.out.println((char) i + " : " + i);
        }
    }

    // cycles07
    public static void showDivisors() {
        System.out.println("Enter the value m");
        int m = enterInt();
        System.out.println("Enter the value n");
        int n = enterInt();

        for (int i = m; i < n; i++) {
            System.out.println("\n For the number " + i + " the divisors are ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(" " + j);
                }
            }
        }
    }

    // cycles08
    public static void showMatches() {
        System.out.println("Enter first number");
        int first = enterPositiveInteger();
        System.out.println("Enter second number");
        int second = enterPositiveInteger();
        int tempOne;
        int tempTwo;

        System.out.println("Matches : ");
        while (first != 0) {
            tempOne = second;
            tempTwo = first % 10;
            while (tempOne != 0) {
                if ((tempOne % 10) == tempTwo) {
                    System.out.println(" " + tempTwo);
                }
                tempOne /= 10;
            }
            first /= 10;
        }
    }
}
