package com.queue.deployedfrommylinkedlist;

import mylinkedlist.MyLinkedList;

public class MyLinkedListQueue1<E> {
    private MyLinkedList<E> mll;
    private int size;

    public MyLinkedListQueue1(){
        this.mll = new MyLinkedList<>();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return mll.isEmpty() ? true : false;
    }

    public boolean isFull(){
        return false;
    }

    public void enqueue(E e){
        mll.addLast(e);
        size++;
    }

    public E dequeue(){
        return mll.removeFirst();
    }

    public E peek(){
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }else {
            return mll.getFirst();
        }
    }

    public void display(){
        mll.printList();
    }
}
