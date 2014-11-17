package com.zhy.algorithm.structure.stack;

public class Stack {

    private Object[] data;

    private int maxSize;

    private int top;

    public Stack(int size) {
        maxSize = size;
        top = 0;
        data = new Object[size];
    }

    public int getSize() {
        return maxSize;
    }

    public int getElementCount() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;

    }

    public boolean isFull() {
        return top == maxSize;
    }
    
    public void push(Object o) {
        if(!isFull()) {
            this.data[top++] = o;
        }
    }
    
    public Object pop() throws Exception {
        if(!isEmpty()) {
            return data[--top];
        } else {
            throw new Exception("栈已空!");  
        }
    }
    
    /** 
     * 返回栈顶元素 
     * @return 
     */  
    public Object peek()  
    {  
      return this.data[getElementCount()];    
    }  
    
    public static void main(String[] args) throws Exception {
        Stack stack=new Stack(1000);        
        stack.push(new String("1"));        
        stack.push(new String("2"));        
        stack.push(new String("3"));        
        stack.push(new String("4"));        
        stack.push(new String("5"));    
        System.out.println(stack.peek());   
        
        while(stack.top>=0)        
        {        
            System.out.println(stack.pop());        
        }               
    }
}
