package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Arrays;

class SortedTest {

    @Test
    void quickSort() {
        Sorted s = new Sorted();
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = n - i;
        }
        s.quickSort(a, 0, n - 1);
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < n; i++) {
            assertEquals(expected[i], a[i]);
        }
    }

    @Test
    void quickSortL() {
        Sorted s = new Sorted();
        int n = 10;
        long[] a = new long[n];
        for (int i = 0; i < n; i++){
            a[i] = n - i;
        }
        s.quickSort(a, 0, n - 1);
        long[] expected = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < n; i++) {
            assertEquals(expected[i], a[i]);
        }
    }

    @Test
    void bubbleSort() {
        Sorted s = new Sorted();
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = n - i;
        }
        int[] actual = s.bubleSort(a);
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < n; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void BubbleSortL() {
        Sorted s = new Sorted();
        int n = 10;
        long[] a= new long[n];
        for (int i = 0; i < n; i++){
            a[i] = n - i;
        }
        long[] actual = s.bubleSort(a);
        long[] expected = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < n; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    void randArray(int[] a, int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(1000);
        }
    }
    void randArray(long[] a, int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextLong(2000000000000L);
        }
    }

    @Test
    void quickSort2() {
        Sorted s = new Sorted();
        int n = 1000;
        int[] a = new int[n];
        randArray(a, n);
        int[] aCopy = new int[n];
        for(int i = 0; i < n; i++){
            aCopy[i] = a[i];
        }
        Arrays.sort(aCopy);
        s.quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            assertEquals(aCopy[i], a[i]);
        }
    }

    @Test
    void quickSortL2() {
        Sorted s = new Sorted();
        int n = 1000;
        long[] a = new long[n];
        randArray(a, n);
        long[] aCopy = new long[n];
        for(int i = 0; i < n; i++){
            aCopy[i] = a[i];
        }
        Arrays.sort(aCopy);
        s.quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            assertEquals(aCopy[i], a[i]);
        }
    }

    @Test
    void bubbleSort2() {
        Sorted s = new Sorted();
        int n = 1000;
        int[] a = new int[n];
        randArray(a, n);
        int[] aCopy = new int[n];
        for(int i = 0; i < n; i++){
            aCopy[i] = a[i];
        }
        Arrays.sort(aCopy);
        int[] actual = s.bubleSort(a);
        for (int i = 0; i < n; i++) {
            assertEquals(aCopy[i], actual[i]);
        }
    }

    @Test
    void BubbleSortL2() {
        Sorted s = new Sorted();
        int n = 1000;
        long[] a = new long[n];
        randArray(a, n);
        long[] aCopy = new long[n];
        for(int i = 0; i < n; i++){
            aCopy[i] = a[i];
        }
        Arrays.sort(aCopy);
        long[] actual = s.bubleSort(a);
        for (int i = 0; i < n; i++) {
            assertEquals(aCopy[i], actual[i]);
        }
    }
}

