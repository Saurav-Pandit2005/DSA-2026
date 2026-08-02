// Search (Recursive)     - O(n)

/*

    Search for a key in a Linked List. Return the position where it is found. if not found, return -1.

*/

package Linked_Lists;

public class Q2 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        
        if(idx == -1) {
                return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        Q2 ll = new Q2();

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(ll.recursiveSearch(30));         // 2
    }
}
