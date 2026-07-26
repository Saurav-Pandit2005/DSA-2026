// Reverse a String using a Stack

package Stack;

import java.util.Stack;

public class Q2 {
    public static String ReverseString(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char current = s.pop();
            result.append(current);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "SAURAV";
        String Result = ReverseString(str);
        System.out.println(Result);
    }
}
