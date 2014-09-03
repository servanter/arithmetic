package com.zhy.algorithm.sort;

public class Insert {

    public static void insert(int src[]){
        for(int i = 1; i < src.length; i++) {
            int temp = src[i];
            int j = i;
            while(src[j - 1] > temp) {
                src[j] = src[j - 1];
                j--;
                if(j<=0) {
                    break;
                }
            }
            src[j] = temp;
        }
        for(int a : src) {
            System.out.print( a + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] a = new int[]{7,5,2,6,3,9,8,1};
        insert(a);
    }
}
