// Container with Most Water (2 Pointer Approch)

/*
    For give n lines on x-axis, use 2 lines to form a container such that it holds maximum water.

    height = [1,8,6,2,5,4,8,3,7];       output = 49
*/
package ArrayList;

public class Q6 {

    // Using Array (Brute Force) - O(n2)

    public static int Most_Water(int[] height) {
        int maxWater = 0, lp = 0, rp = height.length-1;
        while(lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int wt = rp-lp;
            int currWater = ht*wt;
            maxWater = Math.max(maxWater, currWater);
            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    // Using ArrayList (Brute Force) - O(n2)

    public static void main(String[] args) {

        // Using Array (Brute Force) - O(n2)

        // int[] height = {1,8,6,2,5,4,8,3,7};
        // System.out.println(Most_Water(height));
    }
}
