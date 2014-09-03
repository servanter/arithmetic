package com.zhy.algorithm.sort;

public class Bubbling {

    public static void main(String[] args) {
        int[] a = new int[]{7,5,2,6,3,9,8,1};
        sort(a);
//        for(int b : a) {
//          System.out.print(b + " ");
//      }
    }
    
    public static void sort(int src[]) {
        for(int i = 0; i < src.length; i ++) {
            for(int j = 0; j < src.length - 1; j++) {
                if(src[j + 1] < src[j]) {
                    int temp = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = temp;
                }
            }
            for(int b : src) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
