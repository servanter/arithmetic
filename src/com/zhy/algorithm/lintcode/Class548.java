package com.zhy.algorithm.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class548 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        List<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (true) {
            if (i >= nums1.length) {
                break;
            }
            if (j >= nums2.length) {
                break;
            }
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }

        }
        int[] b = new int[result.size()];
        Integer[] a = new Integer[result.size()];
        result.toArray(a);
        for (int m = 0; m < a.length; m++) {
            b[m] = a[m];
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30,
                67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55,
                66, 82, 0, 79, 11, 81 };
        int b[] = new int[] { 5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48 };
        System.err.println(Arrays.toString(new Class548().intersection(a, b)));
        ;
    }
}
