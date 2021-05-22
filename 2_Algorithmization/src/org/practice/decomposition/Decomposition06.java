package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition06 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number ");
            int a = enterPositiveGreaterThanOne(scanner);
            System.out.println("Enter second number ");
            int b = enterPositiveGreaterThanOne(scanner);
            System.out.println("Enter third number ");
            int c = enterPositiveGreaterThanOne(scanner);

            System.out.println("Are these three numbers coprime? - " + isMutuallyPrime(a, b, c));
        }
    }

    public static boolean isMutuallyPrime(int a, int b, int c) {
        return gcd(gcd(a, b), c) == 1;
    }

    public static int gcd(int a, int b) { //nod
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
