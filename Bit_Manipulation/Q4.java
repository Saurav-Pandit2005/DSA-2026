// Clear ith Bit

package Bit_Manipulation;

public class Q4 {
    public static int Cleat_ith_Bit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n = 10, i = 1;
        System.out.println(Cleat_ith_Bit(n, i));
    }
}
