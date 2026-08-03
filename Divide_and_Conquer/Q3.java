// Sorted & Rotated Array Search

/*

    Input : Sorted, Rotated array with distnct numbers(in ascending order) it is rotated at a pivot point, find the index of given element.

*/

package Divide_and_Conquer;

public class Q3 {

    public static int search(int nums[], int target, int si, int ei) {

        if(si > ei) {
            return -1;
        }

        int mid = si + (ei-si) / 2;
        if(nums[mid] == target) {
            return mid;
        }

        if(nums[si] <= nums[mid]) {
            // case a : left
            if(nums[si] <= target && target <= nums[mid]) {
                return search(nums, target, si, mid-1);
            } else {
                // case b : right
                return search(nums, target, mid+1, ei);
            }
        }

        else {
            // case c : right
            if(nums[mid] <= target && target <= nums[ei]) {
                return search(nums, target, mid+1, ei);
            } else {
                // case d : right
                return search(nums, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target, 0, nums.length-1));
    }
}
