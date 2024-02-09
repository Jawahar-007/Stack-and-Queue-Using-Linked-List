package com.bridgelabz.StackQueue;

class Queue<W> {
    MyNode<W> front;
    MyNode<W> rear;
    public Queue(){
        this.front = null;
        this.rear = null;
    }
    public void enqueue(W value){
        MyNode<W> newNode = new MyNode<>(value);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }
            else
            { rear.next = newNode; rear = newNode;}
    }

    public void displayElement(){
        MyNode<W> node = front;
        while(node != null){
            System.out.println(node.data+"->");
            node = node.next;
        }
        System.out.println("End");
    }
    boolean isEmpty(){
        return front == null && rear == null;
    }
}
