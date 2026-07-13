/*  largest and smallest in Array   */

package  Arrays;

public class Q2 {

    public static int largest_element(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int smallest_element(int nums[]) {
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        int nums[] = {2,4,48,20,22,13,57,0,78,23,147,29,87};

        int largest_ele = largest_element(nums);
        System.out.println("largest element in array is : " + largest_ele);

        int smallest_ele = smallest_element(nums);
        System.out.println("Smallest element in array is : " + smallest_ele);

    }
}
