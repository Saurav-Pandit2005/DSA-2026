// Max Area in Histogram      -   O(n)

/*

    Given an array of integers heights representing the histogram's bar heights, where the width of each bar is 1, 
    return the area of the largest rectangle in the histogram.

    Example :

        Input: heights = [2, 1, 5, 6, 2, 3]
        Output: 10

    Explanation

    -> The largest rectangle has an area of 10, formed by the bars with heights 5 and 6, spanning a width of 2.

*/

package Stack;

import java.util.Stack;

public class Q8 {

    public static void maxAreaHistogram(int nums[]) {

        int maxArea = 0;

        int nsr[] = new int[nums.length];         // Next Smaller Right
        int nsl[] = new int[nums.length];         // Next Smaller Left

        // Next Smaller Right

        Stack<Integer> s = new Stack<>();

        for(int i=nums.length-1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = nums.length;           // nums.length;
            } else {
                nsr[i] = s.peek();              // Top
            }
            s.push(i);
        }

        // Next Smaller Left

        s = new Stack<>();

        for(int i=0; i <nums.length; i++) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = nums.length;           // -1;
            } else {
                nsl[i] = s.peek();              // Top
            }
            s.push(i);
        }

        // Current Area : Width = j-i-1 = nsr[i] - nsl[i] - 1

        for(int i=0; i<nums.length; i++) {
            int height = nums[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(currentArea, maxArea);
        }

        System.out.println("Max Area in Histogram = " + maxArea);
    }
    public static void main(String[] args) {
        int nums[] = {2, 1, 5, 6, 2, 3};
        maxAreaHistogram(nums);
    }
}
