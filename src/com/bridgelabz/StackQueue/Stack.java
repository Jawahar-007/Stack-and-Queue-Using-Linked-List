package com.bridgelabz.StackQueue;

class Stack<W> {
    MyNode<W> top;

    public Stack() {
        this.top = null;
    }

    public void pushElement(W value) {
        MyNode<W> newNode = new MyNode<>(value);
        if (top == null)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
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


