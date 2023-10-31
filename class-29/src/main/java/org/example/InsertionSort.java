package org.example;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 9, 5, 6};
        int[] sortedArray = insertionSort(array);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
