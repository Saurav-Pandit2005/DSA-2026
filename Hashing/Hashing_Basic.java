package Hashing;
import java.util.HashMap;

public class Hashing_Basic {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 500);
        hm.put("China", 1500);
        hm.put("Japan", 1200);
        hm.put("US", 3000);

        System.out.println(hm);

        System.out.println(hm.get("Japan"));
    }
}
