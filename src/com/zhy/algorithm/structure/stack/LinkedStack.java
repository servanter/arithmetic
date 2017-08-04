package com.zhy.algorithm.structure.stack;

import com.zhy.algorithm.test.Node;

public class LinkedStack {
    public Node data;
    private int top;


    public void push(Object object) {
        if(data == null) {
data = new Node(object);
        } else {
            Node temp = data;
            while(temp.getNext() != null) {
                temp =  temp.getNext();
            }
            temp.setNext(new Node(object));
        }
        top++;
    }

    public Object pop() {
        int index  = top - 2;
        Node temp = data;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        if(temp.getNext() != null) {
            Object result = temp.getNext().getValue();
            temp.setNext(null);
            top--;
            return result;
        } else {
            Object result = temp.getValue();
            temp = null;
            data= null;
            top--;
            return result;
        }


    }

    public int getTop(){return top;}
    public static void main(String[] args) {
        LinkedStack testStack = new LinkedStack();
        for (int i = 0; i < 10; i++) {
            testStack.push(i);
        }
        int top  = testStack.getTop();
        for (int i = 0; i < top; i++) {
            System.out.println(testStack.pop());
        }
        System.out.println(testStack.getTop());


        for (int i = 0; i < 10; i++) {
            testStack.push(i);
        }

        int top2  = testStack.getTop();
        System.out.println("-------------" + top2);

        for (int i = 0; i < top2; i++) {
            System.out.println(testStack.pop());
        }
    }
}
