// Print x to the Power n   (Print x^n)

// Tc = O(n)    Sc = O(n)

package Recursion;

public class Q9 {
    public static int Power(int x, int n) {
        if(n == 0) return 1;

        int fnm1 = Power(x, n-1);
        int fn = x * fnm1;
        return fn; 

        //  OR

        // return x * Power(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(Power(x, n));
    }
}
