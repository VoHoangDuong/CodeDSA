package com.stack.deployedfrommylinkedlist;

public class TestMyLinkedListStack1 {
    public static void main(String[] args) {
        MyLinkedListStack1<String> students = new MyLinkedListStack1<>();
        students.push("Duong");
        students.push("Phong");
        students.push("Huy");
        students.push("Long");
        students.push("Thien");
        students.push("Quang");
        students.printList();
        System.out.println("***************************");

        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println("***************************");

        students.printList();
        System.out.println("***************************");

        System.out.println(students.peek());
        System.out.println("***************************");

        students.printList();

    }
}
