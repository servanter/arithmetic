package com.zhy.algorithm.test;

import com.zhy.algorithm.test.Node;

public class LinkedNodeList {
    private Node data;
    private int size = 0;

    public void insert(Object object) {
        Node node = new Node(object);
        Node temp = data;
        if(temp == null) {
            data = node;
        } else {
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
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
        Node first = data;
        data = data.getNext();
        size--;
        return first.getValue();
    }

    public Object get(int index) {
        if(index < size) {
            Node temp = data;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
        return null;
    }
    public static void main(String[] args) {
        LinkedNodeList linkedNodeList = new LinkedNodeList();
        for (int i = 0; i < 10; i++) {
            linkedNodeList.insertFirst(i);
        }
        for (int i = 100; i < 120; i++) {
            linkedNodeList.insert(i);
        }
        int total = linkedNodeList.size;
        for (int i = 0; i < total ; i++) {
            System.out.println(linkedNodeList.deleteFirst());

        }
       /* for (int i = 0; i < linkedNodeList.size; i++) {
            System.out.println(linkedNodeList.get(i));
        }*/
    }
}