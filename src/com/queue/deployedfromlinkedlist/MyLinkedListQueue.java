package com.queue.deployedfromlinkedlist;

import java.util.LinkedList;

public class MyLinkedListQueue<E>{
    private LinkedList<E> ll;
    private int size;

    public MyLinkedListQueue(){
        this.ll = new LinkedList<>();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return ll.isEmpty() ? true : false;
    }

    public boolean isFull(){
        return false;
    }

    public void enqueue(E e){
        ll.addLast(e);
        size++;
    }

    public E dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }else {
            E temp = ll.getFirst();
            ll.removeFirst();
            size--;
            return temp;
        }
    }

    public E peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }else{
            E temp = ll.getFirst();
            return temp;
        }
    }

    public void display(){
        for (int i = 0 ; i < ll.size(); i++){
            System.out.println(ll.get(i));
        }
    }
}
