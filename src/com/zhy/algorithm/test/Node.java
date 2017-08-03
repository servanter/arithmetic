package com.zhy.algorithm.test;

public class Node {
    private Node next;
    private Object value;

    public Node(Object value) {
        this.value = value;
    }
    public  Node(Object value, Node next) {
        this.next = next;
        this.value = value;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext(){
        return next;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public Object getValue(){return value;}
}
