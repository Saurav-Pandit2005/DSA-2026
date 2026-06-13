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

    public static void main(String[] args) {
        Linked_List_Basic ll = new Linked_List_Basic();

        // for understanding ....
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
    }
}


