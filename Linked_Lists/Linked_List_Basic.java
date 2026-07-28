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

    public static void main(String[] args) {
        Linked_List_Basic ll = new Linked_List_Basic();

        // for understanding ....
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // addFirst function
        ll.addFirst(2);
        ll.addFirst(1);

        // addLast function

        ll.addLast(4);
        ll.addLast(5);

        // print function

        ll.print();

        // add in middle function

        ll.addInMiddle(2, 3);
        ll.print();

        // for print size of ll

        System.out.println(ll.size);
    }
}