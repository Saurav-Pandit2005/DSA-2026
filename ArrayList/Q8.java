// Pair Sum - 1 (2 Pointer Apporach O(n))

/*
    Find if any pair in a sorted ArrayList has a target sum.

    list = [1,2,3,4,5,6]    target = 5;
*/
package ArrayList;

import java.util.ArrayList;

public class Q8 {
    public static boolean PairSum_1(ArrayList<Integer> list, int target) {
        int start = 0, end = list.size()-1;
        while(start < end) {
            if(list.get(start) + list.get(end) == target) return true;
            else if(list.get(start) + list.get(end) < target) start++;
            else end--;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;
        System.out.println(PairSum_1(list, target));
    }
}
