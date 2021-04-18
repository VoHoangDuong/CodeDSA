package mylinkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> numbers = new MyLinkedList<>();
        numbers.addFirst(1);
        numbers.addFirst(3);
        numbers.addFirst(10);
        numbers.addFirst(14);
        numbers.addFirst(28);
        numbers.printList();
        System.out.println("******************");

        numbers.add(2,20);
        System.out.println("******************");

        numbers.printList();
        System.out.println("******************");

        System.out.println(numbers.removeFirst());
        System.out.println("******************");

        System.out.println(numbers.removeLast());
        System.out.println("******************");

        System.out.println(numbers.remove(2));

    }
}
