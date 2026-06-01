package Hashing;
import java.util.*;

public class Hashing_Basic {
    public static void main(String[] args) {

        // // Create a HashMap
        // HashMap<String, Integer> hm = new HashMap<>();

        // // Insert Value - O(1)
        // hm.put("India", 500);
        // hm.put("China", 1500);
        // hm.put("Japan", 1200);
        // hm.put("US", 3000);

        // System.out.println(hm);

        // //Get Value - O(1)
        // int val = hm.get("US");
        // System.out.println(val);

        // System.out.println(hm.get("Russia"));

        // // containsKey - O(1)
        // System.out.println(hm.containsKey("Brazil"));
        // System.out.println(hm.containsKey("Japan"));

        // // Remove - O(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // // Size
        // System.out.println(hm.size());

        // // Is Empty
        // System.out.println(hm.isEmpty());

        // HashMap<String, Integer> hm = new HashMap<>();

        // hm.put("India", 2000);
        // hm.put("China", 2500);
        // hm.put("Russia", 3000);
        // hm.put("US", 4000);

        // System.out.println(hm);

        // // Iteration on HashMap

        // Set<String> keys = hm.keySet();         // Creating Set for Iteration
        // System.out.println(keys);

        // for (String k : keys) {
        //     System.out.println("key = " + k + "," + "value = " + hm.get(k));
        // }


        // LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 2000);
        lhm.put("Brazil", 1200);
        lhm.put("Ukrain", 2200);

        System.out.println(lhm);

        // TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Aus", 3600);
        tm.put("India", 2000);
        tm.put("Brazil", 3500);
        tm.put("Chine", 6000);

        System.out.println(tm);
    }
}
