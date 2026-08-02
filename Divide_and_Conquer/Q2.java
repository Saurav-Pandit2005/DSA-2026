// Quick Sort  

// Avg Case TC - O(n log n)    Worst Case TC - O(n^2)         SC - o(1) 

// Worst case occurs when pivot is always the smallest or the largest element

package Divide_and_Conquer;

public class Q2 {

    public static void printArr(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int nums[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        // last element
        int pIdx = partition(nums, si, ei);
        quickSort(nums, si, pIdx-1);                // left
        quickSort(nums, pIdx+1, ei);                // right
    }

    public static int partition(int nums[], int si, int ei) {

        int pivot = nums[ei];       // pivot as last element
        int i = si-1;               // to make place for element smaller than pivot
        
        for(int j=si; j<ei; j++) {
            if(nums[j] <= pivot) {
                i++;
                // swap
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;  
            }
        }
        i++;
        int temp = pivot;
        nums[ei] = nums[i];
        nums[i] = temp;  
        return i;
    }

    public static void main(String[] args) {
        int nums[] = {6, 3, 9, -5, 5, 2, 8};
        quickSort(nums, 0, nums.length-1);
        printArr(nums);
    }
}
