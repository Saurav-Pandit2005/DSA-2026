//      Valid Anagram

/*
    Given two string a and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or pharse,
    typically using all the original letters exacty once.    

    Example :

    s = "race"  t = "care"
    // TRUE
    
    s = "heart"  t = "earth"
    // TRUE

    s = "tulip"  t = "lipid"
    // FALSE

 */

package Hashing;

import java.util.HashMap;

public class Q2 {
    public static boolean Valid_Anagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        
        return map.isEmpty();
    }
    public static void main(String[] args) {
        // String s = "race";
        // String t = "care";

        String s = "tulip";
        String t = "lipid";

        System.out.println(Valid_Anagram(s, t));
    }
}