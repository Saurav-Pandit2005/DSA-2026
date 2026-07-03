// Write a Function to find the first Occurances of an element in an array

// Tc = O(n)       Sc = O(n)

package Recursion;

public class Q7 {
    public static int firstOccurances(int nums[], int i, int key) {
        if(i == nums.length) return -1;
        if(nums[i] == key) return i;
        return firstOccurances(nums, i+1, key);
    }
    public static void main(String[] args) {
        int nums[] = {4,5,2,3,7,9,12,5,17,20};
        int i = 0;
        int key = 12;
        System.out.println(firstOccurances(nums, i, key));
    }
}
