package mylinkedlist;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private E data;
        private Node next;

        public Node(E data){
            this.data =data;
            this.next = null;
        }
    }

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0 ? true : false;
    }

    public void addFirst(E e){
        if (isEmpty()){
            head = new Node(e);
            tail = head;
        }else {
            Node holder = head;
            head = new Node(e);
            head.next =  holder;
        }
        size++;
    }

    public void addLast(E e){
        if (isEmpty()){
            tail = new Node(e);
            head = tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        Node add = new Node(e);
        temp.next = add;
        add.next = holder;
        size++;
    }

    public E removeFirst(){
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }else {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }

    public E removeLast(){
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }else {
            Node current =head;
            for (int i = 0; i < size-2; i++) {
                current = current.next;
            }
            Node temp = tail;
            tail = current;
            size--;
            return temp.data;
        }
    }

    public E remove(int index){
        if (isEmpty() && index >= size){
            System.out.println("Not remove");
            return null;
        }else if (index == 0){
            return removeFirst();
        }else if (index == size-1){
            return removeLast();
        }else {
            Node previous = head;
            for (int i = 1; i < index; i++ ){
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            size--;
            return current.data;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public E getFirst(){
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }else {
            return head.data;
        }
    }

    public E getLast(){
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }else {
            return tail.data;
        }
    }
}
