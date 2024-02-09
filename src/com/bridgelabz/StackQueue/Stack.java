package com.bridgelabz.StackQueue;

class Stack<W> {
    MyNode<W> top;

    public Stack() {
        this.top = null;
    }
    boolean isEmpty(){
        return top == null;
    }

    public void pushElement(W value) {
        MyNode<W> newNode = new MyNode<>(value);
        if (isEmpty())
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    public W peek(){
        if(isEmpty())
            throw new IllegalStateException("Empty Stack");

        return top.data;
    }
    public W popElement(){
        if(top == null){
            throw new IllegalStateException("Empty Stack");
        }
        W data = top.data;
        top = top.next;
        return data;
    }

    public void displayElements(){
        MyNode<W> temp = top;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}


