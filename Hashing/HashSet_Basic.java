package Hashing;
import java.util.*;
public class HashSet_Basic {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet <Integer> set =  new HashSet<>();

        // Operations on HashSet

        // add
        set.add(2);
        set.add(4);
        set.add(10);

        System.out.println(set);

        // remove
        set.remove(4);
        System.out.println(set);

        // containsKey
        if(set.contains(2)) {
            System.out.println("Set Contains 2");
        }

        // size()

        System.out.println(set.size());

        // clear()

        set.clear();
        System.out.println(set);

        // isEmpty()

        System.out.println(set.isEmpty());
    }
}
