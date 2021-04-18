package com.queue.deployedfromlinkedlist;

public class TestMyLinkedListQueue {
    public static void main(String[] args) {
        MyLinkedListQueue<String> students = new MyLinkedListQueue<>();
        students.enqueue("Duong");
        students.enqueue("Han");
        students.enqueue("Phong");
        students.enqueue("Huy");
        students.display();
        System.out.println("**********************");

        System.out.println(students.dequeue());
        System.out.println("**********************");

        students.display();
        System.out.println("**********************");

        System.out.println(students.peek());
    }
}
