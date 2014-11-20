package com.zhy.algorithm.structure.linked;

public class Node {
    protected Object value;
    
    protected Node prev;
    
    protected Node next;
    
    public Node(Object value) {
        this.value = value;
    }
    
    public String toString() {
        return value.toString();
    }
}
