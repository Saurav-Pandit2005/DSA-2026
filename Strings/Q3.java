/*  For a given set of Strings, print the largest string  */

package Strings;

public class Q3 {
    public static void Largest_String(String str[]) {
        String largest = str[0];

        for(int i=1; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String str[] = {"mango", "banana", "orange"};
        Largest_String(str);
    }
}
