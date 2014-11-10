package com.zhy.algorithm.sort;

public class BinaryTreeSort {

    private BinaryTreeSort left;

    private BinaryTreeSort right;

    private int data;

    public BinaryTreeSort(int data) {
        this.data = data;
    }

    public void insert(BinaryTreeSort root, int data) {
        if (root.data > data) {
            if (root.left == null) {
                root.left = new BinaryTreeSort(data);
            } else {
                insert(root.left, data);
            }
        } else {
            if (root.right == null) {
                root.right = new BinaryTreeSort(data);
            } else {
                insert(root.right, data);
            }
        }
    }

    public void inOrder(BinaryTreeSort root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print("-- " + root.data);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] array = { 7, 5, 2, 6, 3, 9, 8, 1 };
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(array[0]);
        for (int i = 1; i < array.length; i++) {
            binaryTreeSort.insert(binaryTreeSort, array[i]);
        }
        binaryTreeSort.inOrder(binaryTreeSort);
    }
}