// Swap 2 Numbers in ArrayList

/*
    list = 2,5,9,3,6      index : idx1 = 1, idx2 = 3
*/

package ArrayList;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        // int temp, idx1 = 1, idx2 = 3;

        // temp = list.get(idx1);
        // list.set(idx1, list.get(idx2));
        // list.set(idx2, temp);

        // OR

        int temp;

        temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);

        System.out.println(list);
    }
}
