package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterPositiveDoubleGreaterThanOne;

public class Decomposition09 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter X ");
            double x = enterPositiveDoubleGreaterThanOne(scanner);
            System.out.println("Enter Y ");
            double y = enterPositiveDoubleGreaterThanOne(scanner);
            System.out.println("Enter Z ");
            double z = enterPositiveDoubleGreaterThanOne(scanner);
            System.out.println("Enter T ");
            double t = enterPositiveDoubleGreaterThanOne(scanner);

            System.out.println("Square = " + calculateSquare(x, y, z, t));
        }
    }

    public static double calculateSquare(double x, double y, double z, double t) {
        double d = Math.sqrt(x * x + y * y);
        return square1(x, y) + square2(d, z, t);
    }

    private static double square1(double x, double y) {
        return (x * y) / 2;
    }

    private static double square2(double d, double z, double t) {
        double p = (z + t + d) / 2;
        return Math.sqrt(p*(p-d)*(p-z)*(p-t));
    }
}
