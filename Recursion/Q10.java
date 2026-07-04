// Print x to the Power n   (Print x^n) (Optimized)

// Tc = O(log n)           Sc = O(log n)

package Recursion;

public class Q10 {
    public static int OptimizedPower(int x, int n) {
        if (n == 0) return 1;

        int halfPower = OptimizedPower(x, n/2);

        // if n is even

        int halfPowerSquare = halfPower * halfPower;

        // if n is odd

        if(n % 2 != 0) {
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        int x = 2; 
        int n = 10;
        System.out.println(OptimizedPower(x, n));
    }
}
