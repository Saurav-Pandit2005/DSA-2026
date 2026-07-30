package Linked_Lists;
public class Linked_List_Basic {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add first in ll function
    public void addFirst(int data) {

        // step1 - create newNode
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }


        // step2 - newNode.next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;

    }

    // Add last in ll function
    public void addLast(int data) {

        // step1 - create newNode
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - tail.next = newNode
        tail.next = newNode;

        // step3 - tail = newNode
        tail = newNode;

    }

    // print ll function
    public void print() {

        if(head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add middle at a ll function
    public void addInMiddle(int idx, int data) {

        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx - 1

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first in ll function
    public int RemoveFirst() {
        if(size == 0) {
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // Remove last in ll function
    public int RemoveLast() {
        if(size == 0) {
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        }
        
        else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        // prev node = i = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int value = prev.next.data;     // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public static void main(String[] args) {
        Linked_List_Basic ll = new Linked_List_Basic();

        // for understanding ....
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // addFirst function of ll
        ll.addFirst(2);
        ll.addFirst(1);

        // addLast function of ll

        ll.addLast(4);
        ll.addLast(5);

        // print function of ll

        ll.print();

        // add in middle of ll

        ll.addInMiddle(2, 3);
        ll.print();

        // for print size of ll

        System.out.println(ll.size);

        // Remove first in ll

        ll.RemoveFirst();
        ll.print();
        System.out.println(ll.size);

        // Remove last in ll

        ll.RemoveLast();
        ll.print();
        System.out.println(ll.size);

    }
}