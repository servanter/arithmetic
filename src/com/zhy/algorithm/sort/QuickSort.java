package com.zhy.algorithm.sort;

public class QuickSort {

//    public static void swap(int a[], int i, int j) {
//        if(i == j) return;
//        int tmp = a[i];
//        a[i] = a[j];
//        a[j] = tmp;
//    }
// 
//    /**
//     *
//     * @param array 待排序数组
//     * @param low 数组下标下界
//     * @param high 数组下标上界
//     * @return pivot
//     */
//    public static int partition(int array[], int low, int high) {
//        //当前位置为第一个元素所在位置
//        int p_pos = low;
//        //采用第一个元素为轴
//        int pivot = array[p_pos];
//        
//        for (int i = low + 1; i <= high; i++) {
//            System.out.println(pivot + "------>" + array[i]);
//            if (array[i] < pivot) {            
//               
//                p_pos++;
// 
//                swap(array, p_pos, i); 
// 
//            }
// 
//        }
// 
//        swap(array, low, p_pos);
//        for(int b : array) {
//            System.out.print(b + " ");
//        }
//        System.out.println();
//        return p_pos;
// 
//    }
//    /**
//     * 快速排序实现
//     * @param array
//     * @param low
//     * @param high
//     */
//    public static void quickSort(int array[], int low, int high) {
//        if (low < high) {
//            int pivot = partition(array, low, high);
//            quickSort(array, low, pivot - 1);
//            quickSort(array, pivot + 1, high);
//        }
// 
//    }
    
    
    
    
    
    
    public static void main(String[] stra) {

        int a[] = { 3,0,1,8,7,2,5,4,9,6 };
        quickSort(a, 0, 9);

        System.out.println("==============");
        for(int b : a) {
            System.out.print(b + " ");
        }
    }

    private static void quickSort(int[] src, int low, int high) {
        
        if(low < high) {
            int partIndex = part(src, low, high);
            quickSort(src, low, partIndex - 1);
            quickSort(src, partIndex + 1, high);
        }
    }

    private static int part(int[] src, int low, int high) {
        int temp = src[low];
        int index = low;
        for(int i = low + 1; i <= high;i++) {
            if(src[i] < temp) {
                index++;
                swap(src, i, index);
            }
        }
        swap(src, low, index);
        return index;
    }

    private static void swap(int[] src, int low, int index) {
        if(low == index) return;
        int temp = src[low];
        src[low] = src[index];
        src[index] = temp;
    }


}
