/*      Max Subarray Sum (Brute Force Approch)   */

package  Arrays;

public class Q7 {

    public static int max_subarray_sum(int nums[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currentsum = 0;
                for(int k=i; k<=j; k++){
                    currentsum = currentsum + nums[k];
                    if(maxsum < currentsum){
                        maxsum = currentsum;
                    }
                    System.out.println(currentsum);
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[] = {10,20,30,5,10,50};

        int maxiumsum = max_subarray_sum(nums);
        System.out.println("Max Sumarray sum is : " + maxiumsum);
    }
}
