package com.zhy.algorithm.sort;

import java.util.Arrays;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] num = { 7, 5, 2, 6, 3, 9, 8, 1, 4, 5, 6 };
        int[] result = mergeSort(num);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSort(int[] src) {
        if (src.length == 1) {
            return src;
        }
        int half = src.length / 2;
        int[] pre = new int[half];
        int[] post = new int[src.length - half];
        System.arraycopy(src, 0, pre, 0, pre.length);
        System.arraycopy(src, half, post, 0, post.length);
        int left[] = mergeSort(pre);
        int right[] = mergeSort(post);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int result[] = new int[left.length + right.length];
        while (true) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
                if (i > left.length - 1) {
                    break;
                }
            } else {
                result[k] = right[j];
                j++;
                if (j > right.length - 1) {
                    break;
                }
            }
            k++;
        }
        for (; i < left.length; i++) {
            result[++k] = left[i];
        }
        for (; j < right.length; j++) {
            result[++k] = right[j];
        }
        return result;
    }

}
