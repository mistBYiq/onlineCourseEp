package org.practice.array_sort;

public class ArraySort07 {

    public static void main(String[] args) {
        double[] a = {-10, -5, 1, 5, 10, 15, 20, 25, 30, 40};
        double[] b = {-42, -7, -3, 0, 2, 6, 8, 12, 17, 42};

        showArray(a);
        showArray(b);
        showIndex(a, b);
    }

    public static void showIndex(double[] a, double[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print("Element " + b[i] + " in place with the index " + searchIndex(a, b[i]) + "\n");
        }
    }

    public static int searchIndex(double[] a, double key) {
        int low = 0;
        int high = a.length - 1;
        int index = a.length;

        if (key < a[low]) {
            return low;
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;

                if (a[mid - 1] <= key && key <= a[mid]) {
                    index = mid;
                    break;
                }

                if (a[mid] < key) {
                    low = mid + 1;
                } else if (a[mid] > key) {
                    high = mid - 1;
                } else if (a[mid] == key) {
                    index = mid;
                    break;
                }
            }
        }
        return index;
    }

    public static void showArray(double[] a) {
        for (double v : a) {
            System.out.print(v + "  ");
        }
        System.out.println();
    }
}
