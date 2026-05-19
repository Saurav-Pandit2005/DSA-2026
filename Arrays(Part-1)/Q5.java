/*    Pairs in an Array   */

// Total number of pairs formula : n*(n-1)/2

public class Q5 {
    public static void pairs(int nums[]) {
        int totalpair = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                System.out.print("(" + nums[i] + "," + nums[j] + ")" + " ");
                totalpair++;
            }
            System.out.println(" ");
        }
        System.out.println("Total Pairs : " + totalpair);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        pairs(nums);
    }
}
