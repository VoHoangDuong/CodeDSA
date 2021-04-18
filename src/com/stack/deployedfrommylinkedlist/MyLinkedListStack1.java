package com.stack.deployedfrommylinkedlist;

import mylinkedlist.MyLinkedList;
public class MyLinkedListStack1<E> {
    MyLinkedList<E> stack;

    public MyLinkedListStack1(){
        stack = new MyLinkedList<>();
    }

    public void push(E e){
        stack.addFirst(e);
    }

    public boolean isEmpty(){
        return stack.isEmpty() ? true : false;
    }

    public E pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            return stack.removeFirst();
        }
    }

    public E peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            return stack.getFirst();
        }
    }
    public void printList(){
        stack.printList();
    }
}
