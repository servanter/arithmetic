package com.zhy.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] stra) {
        int a[] = { 3, 0, 1, 8, 7 };
        quickSort(a, 0, 4);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] src, int start, int end) {
        if (start < end) {
            int partindex = part(src, start, end);
            quickSort(src, start, partindex - 1);
            quickSort(src, partindex + 1, end);
        }
    }

    private static int part(int[] src, int start, int end) {
        int temp = src[start];
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (src[i] < temp) {
                index++;
                swap(src, i, index);
            }
        }
        swap(src, start, index);
        return index;
    }

    private static void swap(int[] src, int i, int index) {
        if (i == index) {
            return;
        }
        int temp = src[i];
        src[i] = src[index];
        src[index] = temp;
    }

}
