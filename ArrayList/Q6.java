// Container with Most Water (2 Pointer Approch)

/*
    For give n lines on x-axis, use 2 lines to form a container such that it holds maximum water.

    height = [1,8,6,2,5,4,8,3,7];       output = 49
*/

package ArrayList;

import java.util.ArrayList;

public class Q6 {

    // Using Array (2 Pointer Apporch) - O(n)

    // public static int Most_Water(int[] height) {
    //     int maxWater = 0, lp = 0, rp = height.length-1;
    //     while(lp < rp) {
    //         int ht = Math.min(height[lp], height[rp]);
    //         int wt = rp-lp;
    //         int currWater = ht*wt;
    //         maxWater = Math.max(maxWater, currWater);
    //         if(height[lp] < height[rp]) {
    //             lp++;
    //         } else {
    //             rp--;
    //         }
    //     }
    //     return maxWater;
    // }

    // Using ArrayList (2 Pointer Apporch) - O(n)

    public static int Most_Water(ArrayList<Integer> list) {
        int maxWater = 0, lp = 0, rp = list.size()-1;
        while(lp < rp) {
            int ht = Math.min(list.get(lp), list.get(rp));
            int wt = rp-lp;
            int currWater = ht*wt;
            maxWater = Math.max(maxWater, currWater);
            if(list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        
        return maxWater;
    }

    public static void main(String[] args) {

        // Using Array (2 Pointer Apporch) - O(n)

        // int[] height = {1,8,6,2,5,4,8,3,7};
        // System.out.println(Most_Water(height));

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(list);
        System.out.println(Most_Water(list));
    }
}