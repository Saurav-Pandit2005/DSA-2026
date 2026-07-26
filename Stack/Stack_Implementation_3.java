// Stack Implementation Using Java Collection Framework (JCF)

package Stack;

import java.util.Stack;

public class Stack_Implementation_3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(300);
        s.push(200);
        s.push(100);

        while(! s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
