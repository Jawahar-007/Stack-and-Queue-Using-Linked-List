package com.bridgelabz.StackQueue;

public class Driver{
    public static void main(String[] args) {
        Stack<Integer>integerList = new Stack<>();
        integerList.pushElement(45);
        integerList.pushElement(43);
        integerList.pushElement(42);
        integerList.pushElement(54);
        integerList.displayElements();

        while(integerList.top!= null){
            System.out.println("Peek : "+integerList.peek());
            System.out.println("pop: "+integerList.popElement());
            integerList.displayElements();
        }

        Queue<Integer>integerQueue = new Queue<>();
        integerQueue.enqueue(65);
        integerQueue.enqueue(54);
        integerQueue.enqueue(33);
        integerQueue.enqueue(89);
        System.out.println("Queue Display :");
        integerQueue.displayElement();
    }
}