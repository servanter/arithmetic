package com.zhy.algorithm.sort;

import java.util.Arrays;

public class Bubbling {

    public static void main(String[] args) {
        int[] a = new int[] { 7, 5, 2, 6, 3, 9, 8, 1 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int src[]) {
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src.length - 1; j++) {
                if (src[j] > src[j + 1]) {
                    int temp = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = temp;
                }
            }
        }
    }
}
