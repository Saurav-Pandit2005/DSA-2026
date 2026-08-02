// Clear last i Bit

package Bit_Manipulation;

public class Q6 {

    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n = 15, i = 2;
        System.out.println(clearIBits(n, i));
    }
}
