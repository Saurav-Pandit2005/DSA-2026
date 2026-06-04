// Union & Intersection of 2 arrays
/*
    arr1 = {7,3,9}
    arr2  {6,3,9,2,9,4}

    union = 6 (7,3,9,6,2,4)
    intersection = 2 (3,9)
*/
package Hashing;

import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        // Union

        HashSet<Integer> set = new HashSet<>();

        for(Integer num : arr1) {
            set.add(num);
        }

        for(Integer num : arr2) {
            set.add(num);
        }

        System.out.println(set + " = " + set.size());
        System.out.println(set.size());

        // Intersection

        set.clear();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        HashSet<Integer> inter = new HashSet<>();
        for(int i=0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                inter.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println(inter + " = " + count);
    }
}
