package com.zhy.algorithm.sort;

public class Select {

    public static void main(String[] args) {
        int[] a = new int[]{7,5,2,6,3,9,8,1};
        select(a);
    }
    
    public static void select(int src[]) {
        for(int i = 0; i < src.length; i++) {
            for(int j = i + 1; j < src.length; j++) {
                if(src[j] < src[i]) {
                    int temp = src[j];
                    src[j] = src[i];
                    src[i] = temp;
                }
            }
            for(int b : src) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
