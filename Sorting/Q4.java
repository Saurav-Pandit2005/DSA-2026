// Inbuilt Sort

package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Q4 {

    public static void main(String[] args) {
        // For descending order we need Integer[] instead of int[]
        Integer nums[] = {10, 2, 15, 16, 4, 11};

        //  Inbuilt Sort Function (Ascending Order)
        Arrays.sort(nums);
        System.out.println("Ascending Order: " + Arrays.toString(nums));

        System.out.println("----------------------------------------");

        //  Inbuilt Sort Function (Ascending Order) Using Indexes
        Integer nums1[] = {10, 2, 15, 16, 4, 11};
        Arrays.sort(nums1, 1, 5); // sorts from index 1 to 4 (ei is non-inclusive)
        System.out.println("Ascending Order (Indexes 1–4): " + Arrays.toString(nums1));

        System.out.println("------------------------------------------------------");

        //  Inbuilt Sort Function (Descending Order)
        Integer nums2[] = {10, 2, 15, 16, 4, 11};
        Arrays.sort(nums2, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(nums2));

        System.out.println("-----------------------------------------");

        //  Inbuilt Sort Function (Descending Order) Using Indexes
        Integer nums3[] = {10, 2, 15, 16, 4, 11};
        Arrays.sort(nums3, 1, 5, Collections.reverseOrder()); // sorts from index 1 to 4
        System.out.println("Descending Order (Indexes 1–4): " + Arrays.toString(nums3));

        System.out.println("-------------------------------------------------------");
    }
}
