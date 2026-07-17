// Pair Sum - 2 (2 Pointer Apporach O(n))

/*
    Find if any pair in a Sorted & Rotated ArrayList has a target sum.

    list = [11,15,6,8,9,10]    target = 16;
*/

package ArrayList;

import java.util.ArrayList;

public class Q9 {
    public static boolean PairSum_2(ArrayList<Integer> list, int target) {
        // Find Breaking Point

        int bp = -1;
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int start = bp+1;   // Smallest Element in List
        int end = bp;       // Largest Element in List

        int n = list.size();

        while(start != end) {
            if(list.get(start) + list.get(end) == target) return true;
            if (list.get(start) + list.get(end) < target) start = (start + 1) % n;
            else end = (n + end - 1) % n;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 11, 15, 6, 8, 9, 10  - Sorted & Rotated

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(PairSum_2(list, target));
    }
}
