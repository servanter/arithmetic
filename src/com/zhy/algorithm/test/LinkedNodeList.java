package com.zhy.algorithm.test;

import com.zhy.algorithm.test.Node;

public class LinkedNodeList {
    private  Node data;
    private int size;

    public void insert(Object object) {
        Node node = new Node(object);
        if(data != null) {
            Node temp = data;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        } else{
            data = node;
        }

        size++;
    }

    public void insertFirst(Object object) {
        Node node = new Node(object);
        node.setNext(data);
        data = node;
        size++;
    }

    public Object deleteFirst() {
        Object result = data.getValue();
        data = data.getNext();
        size--;
        return result;
    }

    public Object get(int index) {
        if(index >= size ) {
            return null;
        }
        Node temp = data;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }
    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        LinkedNodeList linkedNodeList = new LinkedNodeList();
        for (int i = 0; i < 10; i++) {
            linkedNodeList.insert(i);
        }

        for (int i = 110; i < 120; i++) {
            linkedNodeList.insertFirst(i);
        }

        System.out.println(linkedNodeList.get(5));
        int total  = linkedNodeList.getSize();
        for (int i = 0; i < total; i++) {
            System.out.println(linkedNodeList.deleteFirst());
        }
    }
}