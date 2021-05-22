package org.practice.decomposition;

import java.util.Scanner;

import static org.practice.util.Util.enterInteger;
import static org.practice.util.Util.enterPositiveGreaterThanOne;

public class Decomposition04 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter N the number of points");
            int n = enterPositiveGreaterThanOne(scanner);

            int[] arrayX = new int[n];
            int[] arrayY = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter the X coordinate of the point number = " + (i + 1));
                arrayX[i] = enterInteger(scanner);
                System.out.println("Enter the Y coordinate of the point number = " + (i + 1));
                arrayY[i] = enterInteger(scanner);
            }

            System.out.println("Given Points: ");
            for (int i = 0; i < n; i++) {
                System.out.println("Point number " + (i + 1) + "  (" + arrayX[i] + ", " + arrayY[i] + ")");
            }

            findMaximumDistance(arrayX, arrayY, n);
        }
    }

    private static void findMaximumDistance(int[] arrayX, int[] arrayY, int n) {
        double distance;
        double maxDistance = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i != j) {
                    distance = Math.sqrt(Math.pow((arrayX[j] - arrayX[i]), 2) + Math.pow((arrayY[j] - arrayY[i]), 2));
                    if (maxDistance < distance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        System.out.println("\nMaximum distance = " + maxDistance);
    }
}
