package com.zhy.algorithm.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] num = new int[] { 0, 16, 7, 3, 20, 17, 8 };
        heapsort(num, 6);
        System.out.println(Arrays.toString(num));
    }

    // 调整堆

    public static void adjustHeap(int[] num, int s, int t) {

        int i = s;
        int x = num[s];
        for (int j = 2 * i; j <= t; j = 2 * j) {
            if (j < t && num[j] < num[j + 1])
                j = j + 1;// 找出较大者把较大者给num[i]
            if (x > num[j])
                break;
            num[i] = num[j];
            i = j;

        }

        num[i] = x;
        System.out.println(Arrays.toString(num));
        System.out.println("====================");
    }

    public static void heapsort(int[] num, int n) {
        // 初始建堆从n/2开始向根调整

        int i;
        for (i = n / 2; i >= 1; i--) {
            adjustHeap(num, i, n);// 初始堆过程
        }
        System.out.println("++++++++++");

        for (i = n; i > 1; i--) {
            num[0] = num[i];// 将堆顶元素与第n,n-1,.....2个元素相交换
            num[i] = num[1];
            num[1] = num[0];// 从num[1]到num[i-1]调整成新堆
            adjustHeap(num, 1, i - 1);
            System.out.println(Arrays.toString(num));

        }

    }

}
