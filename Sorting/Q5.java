// Counting Sort

package Sorting;

public class Q5 {
    public static void CountingSort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<nums.length; i++) {
            count[nums[i]]++;
        }

        // Sorting
        int j=0;
        for(int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void PrintArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {10,2,15,16,4,11};
        CountingSort(nums);
        PrintArray(nums);
    }
}
