// Search (Iterative)     - O(n)

/*

    Search for a key in a Linked List. Return the position where it is found. if not found, return -1.

*/

package Linked_Lists;


public class Q1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public int IterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key) {
                return i;           // key found
            }
            temp = temp.next;
            i++;
        }

        return -1;          // key not found
    }

    public static void main(String[] args) {
        Q1 ll = new Q1();

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(ll.IterativeSearch(20)); // 1
    }
}
