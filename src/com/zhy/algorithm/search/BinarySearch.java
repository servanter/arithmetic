package com.zhy.algorithm.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] some = new int[] { 1, 5, 7, 9, 11, 23, 25, 65, 87, 112, 324, 456, 5676, 879675,1111111 };
        erFen(some,1);
    }
    
    public static int erFen(int[] arr, int data) {
        int count = 0;
        int start = 0;
        int end = arr.length -1;
        int index=0;
        while(true) {
            count++;
            index = (start + end) /2;
            System.out.println(arr[index]);
            if(arr[index] > data) {
                end = index;
            } else if (arr[index] < data) {
                start = index;
            } else {
                break;
            }
            
        }
        System.out.println(count);
        return index;
    }

}
