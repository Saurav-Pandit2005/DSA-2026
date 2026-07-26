// Push at the Bottom of the Stack

package Stack;

import java.util.Stack;

public class Q1 {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(100);
        s.push(200);
        s.push(300);

        int data = 400;

        pushAtBottom(s, data);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
