// Check if a number is a Power of 2 or not.

/*

    n = log n + 1 

*/

package Bit_Manipulation;

public class Q8 {

    public static boolean isPowerofTwo(int n) {
        return ((n&(n-1)) == 0);
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerofTwo(n));
    }
}
