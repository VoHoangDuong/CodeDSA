package com.queue.deployedfrommylinkedlist;

public class TestMyLinkedList1 {
    public static void main(String[] args) {
        MyLinkedListQueue1<Double> numbers = new MyLinkedListQueue1<>();
        numbers.enqueue(2.0);
        numbers.enqueue(3.2);
        numbers.enqueue(6.5);
        numbers.enqueue(5.3);
        numbers.enqueue(7.0);
        numbers.display();
        System.out.println("**************************");

        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());
        System.out.println("***************************");

        numbers.display();
        System.out.println("***************************");

        System.out.println(numbers.peek());
        System.out.println("***************************");

        numbers.display();
    }
}
