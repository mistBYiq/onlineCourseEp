package org.practice.decomposition;

import java.util.Scanner;

public class Decomposition13 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter second number N");
            int n = enterPositiveGreaterThanTwo(scanner);

            findTwinPrimes(n);
        }
    }

    public static void findTwinPrimes(int n) {
        int tempPrime = n;
        for (int i = n; i < n * 2; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / j; j++) {

                if ((i % j) == 0) {
                    isPrime = false;
                }
                if (isPrime) {
                    if (tempPrime + 2 == i) {
                        System.out.println("Twin prime " + tempPrime + " and " + i);
                    }
                    tempPrime = i;
                }
            }
        }
    }


    public static int enterPositiveGreaterThanTwo(Scanner scanner) {
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Sorry, but this is clearly not a positive number greater than two! Try again!");
                scanner.next();
            }

            n = scanner.nextInt();

            if (n < 2) {
                System.out.println("Enter a positive number greater than two");
            }
        } while (n < 2);
        return n;
    }
}
