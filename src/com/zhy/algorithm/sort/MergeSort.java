package com.zhy.algorithm.sort;

import java.util.Collections;

/**
 * 归并排序
 * 
 * @author zhanghongyan
 *
 */
public class MergeSort {

    /**
     * 归并排序 先将初始的序列表看成是n个长度为1的有序表 (1)定义指针i,指向第一个序列表的第一个元素 (2)定义指针j，指向第二个序列表的第一个元素 (3)比较i,j指向的元素大小，若前者大，将后者插入到新表中 否则，把前者插入到后表中 (4)直到取完第一个序列表或者第二个序列表为止
     * 
     * @param args
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] num = { 7, 5, 2, 6, 3, 9, 8, 1 };
        int[] num1 = new int[8];
        num = mergesort(num, 0, num.length - 1, num1);

        for (int i : num) {
            System.out.print(i + " ");
        }

    }

    private static int[] mergesort(int[] num, int s, int t, int[] num1) {

        int m;
        int[] num2 = new int[t + 1];
        if (s == t)
            num1[s] = num[s];

        else {
            m = (s + t) / 2;
            mergesort(num, s, m, num2);// 左半部分递归调用
            mergesort(num, m + 1, t, num2);// 右半部分递归调用
            merg(num2, s, m, t, num1);// 由num2去归并，返回的值放到num1中,num1赋新值，其实就是更新num2,然后让num2再去归并，返回新的num1

        }

        return num1;
    }

    // 有序表的合并

    private static void merg(int[] num, int l, int m, int n, int[] num1) {
        System.out.print("l=" + l + " m=" + m + " n=" + n);
        System.out.println();
        int i, j, k;
        i = l;
        j = m + 1;
        k = l;
        while (i <= m && j <= n) {
            if (num[i] < num[j])
                num1[k++] = num[i++];
            else {
                num1[k++] = num[j++];
            }
        }

        while (i <= m) {
            num1[k++] = num[i++];
        }
        while (j <= n) {
            num1[k++] = num[j++];
        }

    }

}