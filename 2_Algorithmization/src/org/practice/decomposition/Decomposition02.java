package org.practice.decomposition;

public class Decomposition02 {

    public static void main(String[] args) {
        int[] array = {48, 16, 24, 96};

        System.out.println("result = " + multiGcd(array));
    }

    public static int multiGcd(int[] array) {
        int multi = array[0];

        for (int i = 1; i < array.length; i++) {
            multi = gcd(multi, array[i]);
        }
        return multi;
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