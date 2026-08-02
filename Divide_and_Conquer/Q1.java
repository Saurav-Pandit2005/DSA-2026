// Merge Sort  

// TC - O(n log n)      SC - o(n) 

package Divide_and_Conquer;

public class Q1 {

    public static void printArr(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei-si) / 2;           // finding mid
        mergeSort(nums, si, mid);             // left part
        mergeSort(nums, mid+1, ei);           // right part
        merge(nums, si, mid, ei);
    }

    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;                         // iterator for left part
        int j = mid+1;                      // iterator for right part
        int k = 0;                          // iterator for temp array

        while(i <= mid  && j <= ei) {
            if(nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++; 
            } else {
                temp[k] = nums[j];
                j++; 
            }
            k++;
        }

        // left part

        while(i <= mid) {
            temp[k++] = nums[i++];
        }

        // right part

        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // copy temp to original array

        for(k=0, i=si; k<temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int nums[] = {6, 3, 9, -5, 5, 2, 8};
        mergeSort(nums, 0, nums.length-1);
        printArr(nums);
    }
}