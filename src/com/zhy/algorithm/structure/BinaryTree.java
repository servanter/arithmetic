package com.zhy.algorithm.structure;

public class BinaryTree {

    private BinaryTree left;

    private BinaryTree right;

    private int data;

    public BinaryTree(int data) {
        this.data = data;
    }

    public void insert(BinaryTree root, int data) {
        if (data > root.data) {
            if (root.right == null) {
                root.right = new BinaryTree(data);
            } else {
                insert(root.right, data);
            }
        } else {
            if (root.left == null) {
                root.left = new BinaryTree(data);
            } else {
                insert(root.left, data);
            }
        }
    }

    public void preOrder(BinaryTree root) {
        if (root != null) {
            System.out.print(root.data + "--");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(BinaryTree root) { // 中根遍历
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + "--");
            inOrder(root.right);
        }
    }

    public void postOrder(BinaryTree root) { // 后根遍历
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "---");
        }
    }

    public static void main(String[] str) {
        int[] array = { 7, 5, 2, 6, 3, 9, 8, 1  };
        BinaryTree root = new BinaryTree(array[0]); // 创建二叉树
        for (int i = 1; i < array.length; i++) {
            root.insert(root, array[i]); // 向二叉树中插入数据
        }
        System.out.println("先根遍历：");
        root.preOrder(root);
        System.out.println();
        System.out.println("中根遍历：");
        root.inOrder(root);
        System.out.println();
        System.out.println("后根遍历：");
        root.postOrder(root);
    }

}