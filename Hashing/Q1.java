/*
    Given an integer array of size n, find all elements that appear more than [n/3] times.

    Example :

    nums[] = {1,3,2,5,1,3,1,5,1};
    // 1
    
    nums[] = {1,2};
    // 1 2

 */

package Hashing;
import java.util.*;;
public class Q1 {

    public static void majority_element(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            // if(map.containsKey(nums[i])) {
            //     map.put(nums[i], map.get(nums[i])+1);
            // } else {
            //     map.put(nums[i], 1);
            // }

            // OR

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) > nums.length/3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majority_element(nums);
    }
}
