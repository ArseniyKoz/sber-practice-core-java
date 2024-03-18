package org.example;

public class Sorted {
    public static int[] bubleSort(int[] x) {
        for(int i = 0; i < x.length - 1; ++i) {
            for(int j = 0; j < x.length - 1 - i; ++j) {
                if (x[j] > x[j + 1]) {
                    int cmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = cmp;
                }
            }
        }

        return x;
    }

    public static long[] bubleSort(long[] x) {
        for(int i = 0; i < x.length - 1; ++i) {
            for(int j = 0; j < x.length - 1 - i; ++j) {
                if (x[j] > x[j + 1]) {
                    long cmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = cmp;
                }
            }
        }

        return x;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(long[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(long[] arr, int low, int high) {
        long pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        long temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
