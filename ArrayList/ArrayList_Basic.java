package ArrayList;

import java.util.ArrayList;

public class ArrayList_Basic {
    public static void main(String[] args) {

        // Creating a ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();

        // Add Element      O(1)

        list1.add(20);
        list1.add(200);
        list1.add(2000);

        list1.add(3,20000);     // O(n)

        System.out.println(list1);

        // Get Element      O(1)

        System.out.println(list1.get(2));

        // Remove Element   O(n)

        System.out.println(list1.remove(1));
        System.out.println(list1);
        
        // Set Element on index     O(n)

        System.out.println(list1.set(1, 200));
        System.out.println(list1);

        // Contains Element

        System.out.println(list1.contains(2000));

        // size of ArrayList

        System.out.println(list1.size());

        for(int i=0; i<list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }
}
