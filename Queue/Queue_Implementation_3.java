package Queue;

public class Queue_Implementation_3 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEmpty fnx

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add fnx                  O(1)

        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Remove fnx               O(n)

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;

            // Single Element in Queue

            if(tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // Peek fnx                     O(1)

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        // Call add fnx

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
