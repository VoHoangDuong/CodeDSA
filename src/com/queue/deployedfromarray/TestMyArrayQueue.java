package com.queue.deployedfromarray;

public class TestMyArrayQueue {
    public static void main(String[] args) {
        MyArrayQueue<Double> points = new MyArrayQueue<>(4);
        points.enqueue(1.2);
        points.enqueue(2.2);
        points.enqueue(3.3);
        points.enqueue(3.6);
        points.display();
        System.out.println("*************************************");

        System.out.println(points.size);
        System.out.println("*************************************");

        points.enqueue(3.9);
        points.enqueue(5.0);
        points.display();
        System.out.println("*************************************");

        System.out.println(points.size);
        System.out.println("*************************************");

        System.out.println(points.dequeue());
        System.out.println("*************************************");

        points.display();
    }
}
