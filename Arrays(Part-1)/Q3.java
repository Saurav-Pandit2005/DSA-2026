/*      Binary Search    */

public class Q3 {

    public static int binary_search(int nums[], int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start =  mid + 1;
            }
            else{
                end = mid - 1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14};
        int target = 12;

        int index = binary_search(nums, target); 
        System.out.println("Index found at : " + index);
    }
}
