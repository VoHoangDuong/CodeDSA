package com.queue.deployedfromarray;

import java.util.Arrays;

public class MyArrayQueue<E>{
    public int capacity;
    public E[] queueArray;
    public int size;

    public MyArrayQueue(int size){
        this.capacity = size;
        queueArray = (E[]) new Object[capacity];
    }

    public boolean isQueueFull(){
        return size == capacity ? true : false;
    }

    public boolean isQueueEmpty(){
        return size == 0 ? true : false;
    }

    public void enqueue(E e){
        if(isQueueFull()){
            queueArray = Arrays.copyOf(queueArray, queueArray.length*2);
        }
        queueArray[size] = e;
        size++;
    }

    public E dequeue(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty");
            return null;
        }else {
            E temp = queueArray[0];
            for (int i = 0; i < queueArray.length-1; i++) {
                queueArray[i] = queueArray[i+1];
            }
            queueArray[size-1] = null;
            size--;
            return temp;
        }
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(queueArray[i]);
        }
    }
}
