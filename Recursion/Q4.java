// Print Sum of N Natural Numbers

package Recursion;

public class Q4 {
    public static int Sum_Of_N(int n) {
        if(n == 1) return 1;
        int Snm1 = Sum_Of_N(n-1);
        int Sum = n + Snm1;
        return Sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum_Of_N(n));
    }
}
