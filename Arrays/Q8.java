/*      Max Subarray Sum (Prefix Sum Approch)   */

package  Arrays;

public class Q8{

    public static int maxsubarray_sum(int nums[]) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        int max_sum = Integer.MIN_VALUE;;

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            int currentsum = 0;
            for(int j=i; j<nums.length; j++){
                if(i == 0){
                    currentsum = prefix[j];
                }else{
                    currentsum = prefix[j] - prefix[i-1];
                }
                if(max_sum < currentsum){
                    max_sum = currentsum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args){
        int nums[] = {10,20,30,5,10,50};

        int max_subarray_sum = maxsubarray_sum(nums);
        System.out.println(max_subarray_sum);
    }
}