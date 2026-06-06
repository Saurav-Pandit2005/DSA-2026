// Container with Most Water (Brute Force)

/*
    For give n lines on x-axis, use 2 lines to form a container such that it holds maximum water.

    height = [1,8,6,2,5,4,8,3,7];       output = 49

*/
package ArrayList;

import java.util.ArrayList;

public class Q5 {

    // Using Array (Brute Force) - O(n2)

    // public static int Most_Water(int[] height) {
    //     int maxWater = 0;
    //     for(int i=0; i<height.length; i++) {
    //         for(int j=i+1; j<height.length; j++) {
    //             int ht = Math.min(height[i], height[j]);
    //             int wt = j-i;
    //             int currWater = ht*wt;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // Using ArrayList (Brute Force) - O(n2)

    public static int Most_Water(ArrayList<Integer> list) {
        int maxWater = 0;
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                int ht = Math.min(list.get(i), list.get(j));
                int wt = j-i;
                int currWater = ht*wt;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        
        // Using Array (Brute Force) - O(n2)

        // int[] height = {1,8,6,2,5,4,8,3,7};
        // System.out.println(Most_Water(height));

        // Using ArrayList (Brute Force)  - O(n2)

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