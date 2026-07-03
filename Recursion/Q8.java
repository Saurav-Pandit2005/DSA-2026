// Write a Function to find the last Occurances of an element in an array

// Tc = O(n)       Sc = O(n)

package Recursion;

public class Q8 {
    public static int lastOccurances(int nums[], int i, int key) {
        if(i == nums.length) return -1;
        int isFound = lastOccurances(nums, i+1, key);
        if(isFound == -1 && nums[i] == key) return i;
        return isFound;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,2,3,7,9,12,5,17,20};
        int i = 0;
        int key = 5;
        System.out.println(lastOccurances(nums, i, key));
    }
}
