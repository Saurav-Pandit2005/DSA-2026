// Duplicate Parentheses

/*

    Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.

    Return true if it contains duplicate parentheses; otherwise, return false.

    Example 1:

        Input: ((((a) + (b)) + c + d))
        Output: true

    Example 2:

        Input: ((a + b) + (c + d))
        Output: false

*/

package Stack;

import java.util.Stack;

public class Q7 {

    public static boolean isDuplicate(String str2) {

        Stack<Character> s = new Stack<>();

        for(int i=0; i<str2.length(); i++) {
            char ch = str2.charAt(i);

            // Closing

            if(ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) return true;      // Duplicate
                else s.pop();                   // Opening Pair
            }

            // Opening 

            else {
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))";        // true
        String str2 = "(a-b)";          // false

        System.out.println(isDuplicate(str2));
    }
}