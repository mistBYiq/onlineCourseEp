package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition01 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter first number ");
            int a = enterPositiveGreaterThanOne(scanner);
            System.out.println("Enter second number ");
            int b = enterPositiveGreaterThanOne(scanner);

            System.out.println(" The LCM for the numbers " + a + " and " + b + " is equal to " + lcm(a, b));
            System.out.println(" GCD for numbers " + a + " and " + b + " is equal to " + gcd(a, b));
        }

    }

    public static int gcd(int a, int b) { //nod
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) { //nok
        return a / gcd(a, b) * b;
    }
}