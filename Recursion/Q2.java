// Print numbers in Increasing Order

package Recursion;

public class Q2 {
    public static void PrintIncreasing(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintIncreasing(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 20;
        PrintIncreasing(n);
    }
}
