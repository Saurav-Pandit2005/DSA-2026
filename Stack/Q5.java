// Next Greater Element

/*

    The next greater element of some element x in an array is the first greater
    element that is to the right of x in the same array

    nums = [6, 8, 0, 1, 3]
    next Greater = [8, -1, 1, 3, -1]

*/

package Stack;

import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {

        int nums[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--) {

            // While loop for condition

            while(!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                s.pop();
            }

            // if else

            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = nums[s.peek()];
            }

            // push in stack

            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}


// These Question forms another 3 and Total 4 Question ....

// next Greater Right Element          -> for(int i=nums.length-1; i>=0; i--)   -> while(!s.isEmpty() && nums[s.peek()] <= nums[i])
// next Greater Left Element           -> for(int i=0; i<nums.length; i++)      -> while(!s.isEmpty() && nums[s.peek()] <= nums[i])
// next smaller Right Element          -> for(int i=nums.length-1; i>=0; i--)   -> while(!s.isEmpty() && nums[s.peek()] >= nums[i])
// next smaller Left Element           -> for(int i=0; i<nums.length; i++)      -> while(!s.isEmpty() && nums[s.peek()] >= nums[i])