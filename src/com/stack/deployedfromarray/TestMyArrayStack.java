package com.stack.deployedfromarray;

public class TestMyArrayStack {
    public static void main(String[] args) {
        MyArrayStack<Integer> numbers = new MyArrayStack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.display();
        System.out.println("***********************************");

        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println("***********************************");

        numbers.display();
        System.out.println("***********************************");

        numbers.push(6);
        numbers.push(10);
        numbers.push(20);
        numbers.display();
        System.out.println("***********************************");

        System.out.println(numbers.peek());
    }
}
