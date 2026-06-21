// Check if number is Odd or Even

package Bit_Manipulation;

public class Q1 {
    public static void Odd_Even(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            // Even Number
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        int n = 12;
        Odd_Even(n);
    }
}
