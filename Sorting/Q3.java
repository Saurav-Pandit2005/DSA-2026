// Insertion Sort

package Sorting;

public class Q3 {
    public static void InsertionSort(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            int CurrentElement = nums[i];
            int PreviousElement = i-1;
            // Finding out the correct position to insert
            while (PreviousElement >= 0 && nums[PreviousElement] > CurrentElement) {
                nums[PreviousElement+1] = nums[PreviousElement];
                PreviousElement--;
            }
            // Insertion
            nums[PreviousElement+1] = CurrentElement;
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
        InsertionSort(nums);
        PrintArray(nums);
    }
}
