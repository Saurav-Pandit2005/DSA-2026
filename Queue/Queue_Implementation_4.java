// Queue Implementation Using Java Collection Framework (JCF)

package Queue;

import java.util.*;

public class Queue_Implementation_4 {
    public static void main(String[] args) {
        
        // Queue<Integer> q = new LinkedList<>();           Method 1 for declear 

        Queue<Integer> q = new ArrayDeque<>();           // Method 2 for declear

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }        
    }
}
