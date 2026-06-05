package ArrayList;

import java.util.ArrayList;

public class multi_dimen_ArrayList {
    public static void main(String[] args) {

        // Main list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // List1
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // List2
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        // List3
        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        // add list1, list2, list3 in Main List

        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println(list);

        // OR

        for(int i=0; i<list.size(); i++) {
            ArrayList<Integer> cureentList = list.get(i);
            for(int j =0; j<cureentList.size(); j++) {
                System.out.print(cureentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
