package com.stack.deployedfromlinkedlist;

import java.util.LinkedList;

public class MyLinkedListStack<E> {
    public LinkedList<E> stack;

    public MyLinkedListStack(){
        stack = new LinkedList();
    }

    public void push(E e){
        stack.addFirst(e);
    }

    public E peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            return stack.getFirst();
        }
    }

    public boolean isEmpty(){
        return stack.size() == 0 ?  true : false;
    }
    public E pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return null;
        }else {
           return stack.removeFirst();
        }
    }

    public void display(){
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
