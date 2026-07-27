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

    public void addFirst(int data) {

        // step1 - create newNode
        Node newNode = new Node(data);

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

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - tail.next = newNode
        tail.next = newNode;

        // step3 - tail = newNode
        tail = newNode;

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

        ll.addLast(3);
        ll.addFirst(4);
    }
}


