package org.practice.decomposition;

public class Decomposition08 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        showSum(array, 1, 6);
    }

    public static void showSum(int[] array, int k, int m) {
        for (int i = k - 1; i + 2 < m; i++) {
            System.out.print(" = " + calculateSumThree(array, i) + "\n");
        }
    }

    public static int calculateSumThree(int[] array, int k) {
        int sum = 0;

        for (int i = k; i < k + 3; i++) {
            sum += array[i];
            System.out.print(array[i] + " ");
        }
        return sum;
    }

}
