package com.zhy.algorithm.sort;

import java.util.Arrays;

public class Select {

    public static void main(String[] args) {
        int[] src = new int[] { 7, 5, 2, 6, 3, 9, 8, 1 };
        directlySelect(src);
        System.out.println(Arrays.toString(src));
    }

    /**
     * select sort.
     * 
     * @param src
     */
    public static void select(int src[]) {
        for (int i = 0; i < src.length; i++) {
            for (int j = i + 1; j < src.length; j++) {
                if (src[j] < src[i]) {
                    int temp = src[i];
                    src[i] = src[j];
                    src[j] = temp;
                }
            }
        }
    }

    /**
     * directly select sort.
     * 
     * @param src
     */
    public static void directlySelect(int src[]) {
        for (int i = 0; i < src.length; i++) {
            int small = i;
            int temp = src[i];
            for (int j = i + 1; j < src.length; j++) {
                if (src[j] < temp) {
                    small = j;
                    temp = src[j];
                }
            }
            src[small] = src[i];
            src[i] = temp;
        }
    }
}
