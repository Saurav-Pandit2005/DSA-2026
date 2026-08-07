// Valid Parentheses     -   O(n)

/*

    Given a string s containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.

    An input string is valid if:

    1. Open brackets must be closed by the same type of brackets.
    2. Open brackets must be closed in the correct order.
    3. Every closing bracket must have a corresponding opening bracket of the same type.

    Examples:

    1. s = "()[]{}" → true
    2. s = "(]" → false
    3. s = "()" → true
    4. s = ")( " → false

*/

package Stack;

import java.util.Stack;

public class Q6 {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            // Opening

            if(ch == '(' || ch == '{' || ch == ']') {
                s.push(ch);
            }
            else {      // Closing
                if(s.isEmpty()) {
                    return false;
                }

                if((s.peek() == '(' && ch == ')') || 
                   (s.peek() == '{' && ch == '}') || 
                   (s.peek() == '[' && ch == ']') ) {

                    s.pop();

                } 
                else {
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "{{}}]";
        System.out.println(isValid(str));
    }
}
