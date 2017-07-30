package com.zhy.algorithm.structure.linked;

/**
 * linked node
 * 
 * @author zhanghongyan
 * 
 */
public class LinkedNode<E> {

    public E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public LinkedNode<E> next;

    public LinkedNode(E value) {
        this.value = value;
    }

    public LinkedNode<E> getNext() {
        return next;
    }

    public void setNext(LinkedNode<E> next) {
        this.next = next;
    }

}
