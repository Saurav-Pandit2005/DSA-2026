// Selection Sort

package Sorting;

public class Q2 {
    public static void SelectionSort(int nums[]){
        for(int i=0; i<nums.length-1; i++) {
            int Smallest = i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[Smallest] > nums[j]) {
                    Smallest = j;
                }
                // Swap
                int temp = nums[Smallest];
                nums[Smallest] = nums[i];
                nums[i] = temp;
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
        SelectionSort(nums);
        PrintArray(nums);
    }
}
