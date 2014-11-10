package com.zhy.algorithm.sort;

import java.util.Arrays;

public class Insert {

    public static void insert(int src[]) {
        for (int i = 1; i < src.length; i++) {
            int j = i;
            int temp = src[i];
            while (src[j - 1] > temp) {
                src[j] = src[j - 1];
                j--;
                if (j <= 0) {
                    break;
                }
            }
            src[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] src = new int[] { 7, 5, 2, 6, 3, 9, 8, 1 };
        insert(src);
        System.out.println(Arrays.toString(src));
    }
}
