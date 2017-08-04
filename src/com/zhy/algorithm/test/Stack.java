package com.zhy.algorithm.test;

public class Stack {

    private int top = 0;
    private int maxSize = 10;
    private Object[] data;

    public Stack() {
        data = new Object[maxSize];
    }
    public void push(Object data) {
        if(top < maxSize) {
            this.data[top++] = data;
        }
    }

    public Object pop() {
        if(top > 0) {
            return data[--top];
        }
        return null;
    }

    public int getTop() {
        return  top;
    }

    public static void main(String[] args) {
        Stack testStack = new Stack();
        for (int i = 0; i < 10; i++) {
            testStack.push(i);
        }
        int top  = testStack.getTop();
        for (int i = 0; i < top; i++) {
            System.out.println(testStack.pop());
        }
    }
}