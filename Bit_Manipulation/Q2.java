// Get ith Bit

package Bit_Manipulation;

public class Q2 {
    public static int Get_ith_Bit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 1, i = 0;
        System.out.println(Get_ith_Bit(n, i));
    }
}
