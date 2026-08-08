// Circular Queue Implementation Using Arrays

package Queue;

public class Queue_Implementation_2 {

    static class Queue {

        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty fnx

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // full fnx

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        // Add fnx                  O(1)

        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // Add 1st Element

            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

         // Remove fnx               O(1)

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];

            // Last Element Remove/Delete

            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return front;
        }

        // Peek fnx                     O(1)

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        // Call add fnx

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
