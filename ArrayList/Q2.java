// Find Maximum in an ArrayList

package ArrayList;

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        list.add(205);

        System.out.println(list);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++) {
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }

            // OR 

            max = Math.max(max, list.get(i));
        }

        System.out.println("Maximum : " + max);
    }
}
