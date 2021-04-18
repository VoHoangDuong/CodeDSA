package com.stack.deployedfromlinkedlist;

public class TestMyLinkedListStack {
    public static void main(String[] args) {
        MyLinkedListStack<String> cars = new MyLinkedListStack<>();
        cars.push("BMW");
        cars.push("Audi");
        cars.push("Toyota");
        cars.push("Honda");
        cars.display();
        System.out.println("*************************************");

        System.out.println(cars.pop());
        System.out.println(cars.pop());
        System.out.println("*************************************");

        cars.display();
        System.out.println("*************************************");

        cars.push("Suzuki");
        cars.push("Nissan");
        cars.display();
        System.out.println("*************************************");

        System.out.println(cars.peek());


    }
}
