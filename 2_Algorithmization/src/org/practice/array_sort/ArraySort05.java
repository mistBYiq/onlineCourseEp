package org.practice.array_sort;

import static org.practice.util.Util.showArray;

public class ArraySort05 {

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 3, 8, 12, 44, 7, 4, 5, 3, 2, 1, 0};
        showArray(array);

        System.out.println();
        sorted(array);

        System.out.println("\nResult array: ");
        showArray(array);
    }

    public static void sorted(int[] a) {
        int index;
        int temp;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                System.out.println("\n sorted items = " + i);

                index = binarySearchCustom(a, a[i], i);
                System.out.println("\n index = " + index);

                if (index < i) {
                    for (int j = i; j > index; j--) {
                        temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                    showArray(a);
                }
            }
        }
    }

    // binary search method in the sorted part of the array, returns the index of the element
    public static int binarySearchCustom(int[] a, int key, int index) {
        int low = 0; // first sorted element
        int high = index - 1; // last sorted element in array


        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("\nMid = " + mid);

            if (mid == 0 && a[mid] <= a[mid + 1]) {
                index = mid;
                break;
            }

            if (a[mid - 1] <= key && key <= a[mid]) {
                // the index (place) where you want to insert this element, keep the sequence ascending
                index = mid;
                break;
            }

            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else if (a[mid] == key) {
                // or the index of an element with the same value,
                index = mid;
                break;
            }

        }
        // or returns the index of the element itself if the value of element (key) is greater than all elements
        // of the ascending sequence.
        return index;
    }

    public static int binarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("\n" + mid);

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
