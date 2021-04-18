package com.stack.deployedfromarray;

import java.util.Arrays;

public class MyArrayStack<E>{
    private E[] array;
    private int size;

    public int getSize() {
        return size;
    }

    public MyArrayStack(){
        this.array = (E[]) new Object[10];
    }

    public boolean isEmpty(){
        return size==0 ? true : false;
    }

    public boolean isFull(){
        return size == array.length ? true : false;
    }

    public void push(E e){
        if (isFull()){
            array = Arrays.copyOf(array, array.length*2);
        }
        array[size] = e;
        size++;
    }

    public E pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            E temp = array[size-1];
            size--;
            return temp;
        }
    }

    public E peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            E temp = array[size-1];
            return temp;
        }
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
