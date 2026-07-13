/*      Print Subarrays   => a countinuous  part of array */

package  Arrays;

public class Q6{
    public static void subarray(int nums[]) {
        int totalsubarray = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k] + " ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray : " + totalsubarray);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        subarray(nums);
    }
}