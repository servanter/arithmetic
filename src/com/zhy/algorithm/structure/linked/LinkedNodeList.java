package com.zhy.algorithm.structure.linked;

/**
 * linked list
 * 
 * @author zhanghongyan
 * 
 */
public class LinkedNodeList<E> {

    private LinkedNode<E> data;

    private int size;

    public LinkedNodeList() {
        data = null;
        size = 0;
    }

    public void insertFirst(E value) {
        LinkedNode<E> node = new LinkedNode<E>(value);
        node.next = data;
        data = node;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public LinkedNode<E> deleteFirst() {
        LinkedNode<E> current = data;
        data = current.next;
        size--;
        return current;
    }

    public void print() {
        LinkedNode<E> node = data;
        for (LinkedNode<E> n = node; n != null; n = n.next) {
            System.out.print(n.value + "--");
        }
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("ArrayIndexError");
        } else {
            LinkedNode<E> node = data;
            int i = 0;
            for (LinkedNode<E> n = node; n != null; n = n.next) {
                if (i == index) {
                    return n.value;
                }
                i++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedNodeList<Integer> linkedNodeList = new LinkedNodeList<Integer>();
        linkedNodeList.insertFirst(2);
        linkedNodeList.insertFirst(345);
        linkedNodeList.insertFirst(56);
        linkedNodeList.insertFirst(2223);
        linkedNodeList.insertFirst(68);
        linkedNodeList.insertFirst(231);
        linkedNodeList.insertFirst(234);
        linkedNodeList.insertFirst(12);
        linkedNodeList.print();
        System.out.println();
        System.out.println(linkedNodeList.get(4));

    }
}
