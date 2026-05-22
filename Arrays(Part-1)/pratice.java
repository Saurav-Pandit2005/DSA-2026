// // Given an array of integers nums and an integer k, return the total number
// //  of subarrays whose sum equals to k.

// // A subarray is a contiguous non-empty sequence of elements within an array.

 

// // Example 1:

// // Input: nums = [1,1,1], k = 2
// // Output: 2
// // Example 2:

// // Input: nums = [1,2,3], k = 3
// // Output: 2



// public class pratice {

//     public static void sum(int nums[], int k ) {
//         int output = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i; j<nums.length; j++){
//                 int sum = 0;
//                 for(int z=i; z<=j; z++){
//                     sum = sum + nums[z];
//                 }
//                 if(sum == k){
//                     output++;
//                 }
//             }
//         }
//         System.out.println(output);
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,1,1};
//         int k = 2;

//         sum(nums, k);
//     }
// }





//-------------------------------------------------------------------------------------------------------------

// 852. Peak Index in a Mountain Array

// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

// Return the index of the peak element.

// Your task is to solve it in O(log(n)) time complexity.

 

// Example 1:

// Input: arr = [0,1,0]

// Output: 1

// Example 2:

// Input: arr = [0,2,1,0]

// Output: 1

// Example 3:

// Input: arr = [0,10,5,2]

// Output: 1

 

// public class pratice{

//     public static int mountain_array(int nums[]) {
        
//     }
//     public static void main(String[] args) {
//         int nums[] = {0,10,5,2};
//     }
// }